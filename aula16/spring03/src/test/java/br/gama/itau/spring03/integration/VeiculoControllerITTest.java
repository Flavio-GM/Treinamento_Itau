package br.gama.itau.spring03.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.hamcrest.CoreMatchers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.gama.itau.spring03.model.Veiculo;
import br.gama.itau.spring03.repository.VeiculoRepo;
import br.gama.itau.spring03.util.GenerateVeiculo;

// Carrega o contexto do Spring para teste usando uma porta aleatória
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc

public class VeiculoControllerITTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private VeiculoRepo veiculoRepo;

    @BeforeEach
    public void setup() {
        veiculoRepo.deleteAll();
    }

    @Test
    public void newVeiculo_returnVeiculoInserido_whenDadosVeiculoValido() throws Exception {
        Veiculo novoVeiculo = GenerateVeiculo.novoVeiculoToSave();

        ResultActions resposta = mockMvc.perform(post("/veiculo")
                .content(objectMapper.writeValueAsString(novoVeiculo))
                .contentType(MediaType.APPLICATION_JSON));
        resposta.andExpectAll(status().isCreated())
                .andExpect(jsonPath("$.placa", CoreMatchers.is(novoVeiculo.getPlaca())));
    }

    @Test
    public void getById_returnVeiculo_whenExist() throws Exception {
        // Preparação
        List<Veiculo> lista = new ArrayList<>();
        lista.add(GenerateVeiculo.novoVeiculoToSave());
        lista.add(GenerateVeiculo.novoVeiculoToSave2());

        veiculoRepo.saveAll(lista);

        // Ação
        ResultActions resposta = mockMvc.perform(get("/veiculo")
                .contentType(MediaType.APPLICATION_JSON));

        // Verifcações
        resposta.andExpect(status().isOk()) // Verifica se o status é OK (200)
                .andExpect(jsonPath("$.size()", CoreMatchers.is(lista.size())))
                .andExpect(jsonPath("$[0].placa", CoreMatchers.is(GenerateVeiculo.veiculoValido().getPlaca())));
    }
}
