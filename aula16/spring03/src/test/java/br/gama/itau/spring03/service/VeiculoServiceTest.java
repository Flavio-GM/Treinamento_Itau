package br.gama.itau.spring03.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import br.gama.itau.spring03.exception.NotFoundException;

import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;
import br.gama.itau.spring03.util.GenerateVeiculo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

import java.util.Optional;


@ExtendWith(MockitoExtension.class)
public class VeiculoServiceTest {

    // Esse obj receberá um Mock da sua dependência
    // esse é o obj da classe a ser testada
    @InjectMocks
    private VeiculoService service;

    // É a dependência a ser injetada
    @Mock
    private VeiculoRepo repo;

    @Test
    public void newVeiculo_returnNewVeiculo_whenVeiculoValido() {
        // Preparação
        BDDMockito.when(repo.save(ArgumentMatchers.any(Veiculo.class)))
                .thenReturn(GenerateVeiculo.veiculoValido());
        
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        // Ação
        Veiculo veiculoCriado = service.newVeiculo(novoVeiculo);

        // Verificação
        assertThat(veiculoCriado).isNotNull();
        assertThat(veiculoCriado.getId()).isPositive();
        assertThat(veiculoCriado.getPlaca()).isEqualTo(novoVeiculo.getPlaca());

        // Verifica se o método save foi chamado 1 vez
        verify(repo, Mockito.times(1)).save(novoVeiculo);
    }

    @Test
    public void newVeiculo_returnNull_whenVeiculoInvalido() {
        // Preparação
        // Não precisa de Mock pois o método save do repo não será chamado
        Veiculo veiculoValido = GenerateVeiculo.veiculoValido();

        // Ação
        Veiculo veiculoRetornado = service.newVeiculo(veiculoValido);

        // Verificação
        assertThat(veiculoRetornado).isNull();
        
        // Verifica que o método save não foi chamado
        verify(repo, Mockito.times(0)).save(veiculoValido);
    }

    @Test
    public void getById_returnVeiculo_whenIdExist() {
        BDDMockito.when(repo.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(GenerateVeiculo.veiculoValido()));
        
        Veiculo veiculoEncontrado = service.getById(1L);

        assertThat(veiculoEncontrado).isNotNull();
        assertThat(veiculoEncontrado.getId()).isGreaterThan(0);
        assertThat(veiculoEncontrado.getPlaca()).isEqualTo(GenerateVeiculo.veiculoValido().getPlaca()).isNotEmpty();
    }

    @Test
    public void getById_throwException_whenIdExist() {
    Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

    // Verifica se uma excepton do tipo NotFoundException é lançada
    // () -> {} é uma chamada de método anônimo
    assertThrows(NotFoundException.class,
        () -> {
            service.getById(novoVeiculo.getId());
        });
    }

    @Test
    public void updateVeiculo_returnUpdatedVeiculo_whenVeiculoValido() {
        // preparação
        BDDMockito.when(repo.findById(ArgumentMatchers.any(Long.class)))
                .thenReturn(Optional.of(GenerateVeiculo.veiculoValido()));

        BDDMockito.when(repo.save(ArgumentMatchers.any(Veiculo.class)))
                .thenReturn(GenerateVeiculo.veiculoValido2());

        Veiculo veiculoParaAtualizar = GenerateVeiculo.veiculoValido2();

        // ação
        Veiculo veiculoAtualizado = service.updateVeiculo(1L, veiculoParaAtualizar);

        // verificação
        assertThat(veiculoAtualizado).isNotNull();
        assertThat(veiculoAtualizado.getId()).isEqualTo(1L);
        assertThat(veiculoAtualizado.getPlaca()).isEqualTo(veiculoParaAtualizar.getPlaca());

        // verifica se o método save foi chamado 1 vez
        verify(repo, Mockito.times(1)).save(veiculoParaAtualizar);
    }
}
