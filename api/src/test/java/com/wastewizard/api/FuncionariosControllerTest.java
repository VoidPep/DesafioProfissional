package com.wastewizard.api;

import com.wastewizard.api.controller.FuncionarioController;
import com.wastewizard.api.funcionario.FuncionarioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FuncionariosControllerTest {
    @Autowired
    private FuncionarioRepository repository;
    @Autowired
    private FuncionarioController controller;

    @Test
    public void deveTestarOMetodoCadastrar() {
        //FuncionarioRequest request = new FuncionarioRequest();
        //request.setNome("João");
        //request.setCpf("123456789");

        //controller.cadastrar(request);


        //List<Funcionario> funcionarios = repository.findAll();
        //assertEquals(1, funcionarios.size());
        //assertEquals("João", funcionarios.get(0).getNome());
        // Verifique outros atributos...
    }
}
