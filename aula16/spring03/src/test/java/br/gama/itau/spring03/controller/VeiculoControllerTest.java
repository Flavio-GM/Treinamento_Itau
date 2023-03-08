package br.gama.itau.spring03.controller;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.gama.itau.spring03.dto.VeiculoDTO;
import br.gama.itau.spring03.exception.NotFoundException;
import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.service.VeiculoService;
import br.gama.itau.spring03.util.GenerateVeiculo;

@WebMvcTest(VeiculoController.class)
public class VeiculoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Json para String

    @MockBean
    private VeiculoService service;

    @Test
    public void getAll_returnListVeiculos_whensuccess() throws Exception {
        // Preparação
        List<VeiculoDTO> lista = new ArrayList<>();
        lista.add(new VeiculoDTO(GenerateVeiculo.veiculoValido()));
        lista.add(new VeiculoDTO(GenerateVeiculo.veiculoValidoId2()));

        BDDMockito.when(service.getAll()).thenReturn(lista);

        // Ação
        ResultActions resposta = mockMvc.perform(get("/veiculo").contentType(MediaType.APPLICATION_JSON));

        // Verificações
        resposta.andExpect(status().isOk()) // Verifica se o status é OK (200)
                .andExpect(jsonPath("$.size()", CoreMatchers.is(lista.size()))) // Verifica se o tamano da lista na
                                                                                // responsta é 2 (lista.size)
                .andExpect(jsonPath("$[0].placa", CoreMatchers.is(GenerateVeiculo.veiculoValido().getPlaca()))); // Verifique
                                                                                                                 // se a
                                                                                                                 // placa
                                                                                                                 // do
                                                                                                                 // primeiro
                                                                                                                 // veiculo
                                                                                                                 // é a
                                                                                                                 // placa
                                                                                                                 // esperada
    }

    @Test
    public void getById_returnVeiculos_whenIdExist() throws Exception {
        Veiculo veiculo = GenerateVeiculo.veiculoValido();

        BDDMockito.when(service.getById(anyLong())).thenReturn(veiculo);

        // Ação
        ResultActions resposta = mockMvc.perform(get("/veiculo/{id}", veiculo.getId())
                .contentType(MediaType.APPLICATION_JSON));
        resposta.andExpectAll(status().isOk())
                .andExpect(jsonPath("$.placa", CoreMatchers.is(veiculo.getPlaca())));
    }

    @Test
    public void getById_returnNotFound_whenIdNotExist() throws Exception {
        final long ID_NOT_EXIST = 0;

        BDDMockito.given(service.getById(anyLong()))
                .willThrow(new NotFoundException("Veículo não encontrado"));

        // se a exceção fosse devolvida para o front, deveria ser usado esta construção

        // assertThatCode( () -> {
        // ResultActions resposta = mockMvc.perform(get("/veiculo/{id}", ID_NOT_EXIST)
        // .contentType(MediaType.APPLICATION_JSON));
        // }).hasCause(new NotFoundException("Veículo não encontrado")) ;

        ResultActions resposta = mockMvc.perform(get("/veiculo/{id}", ID_NOT_EXIST)
                .contentType(MediaType.APPLICATION_JSON));

        resposta.andExpect(status().isNotFound());
    }

    @Test
    public void newVeiculo_returnVeiculoInserido_whenDadosValidos() throws Exception {
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();
        Veiculo veiculoValido = GenerateVeiculo.veiculoValido();

        BDDMockito.when(service.newVeiculo(ArgumentMatchers.any(Veiculo.class)))
                .thenReturn(veiculoValido);

        ResultActions resposta = mockMvc.perform(post("/veiculo")
                .content(objectMapper.writeValueAsString(novoVeiculo))
                .contentType(MediaType.APPLICATION_JSON));

        resposta.andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", CoreMatchers.is(1)))
                .andExpect(jsonPath("$.placa", CoreMatchers.is(novoVeiculo.getPlaca())));
    }
}
