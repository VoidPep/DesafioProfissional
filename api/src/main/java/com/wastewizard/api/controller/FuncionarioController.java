package com.wastewizard.api.controller;

import com.wastewizard.api.funcionario.Endereco;
import com.wastewizard.api.funcionario.Funcionario;
import com.wastewizard.api.funcionario.FuncionarioRepository;
import com.wastewizard.api.funcionario.FuncionarioRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository _repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody FuncionarioRequest dados) {
        Funcionario funcionario = new Funcionario(
                null,
                dados.nome(),
                dados.cpf(),
                dados.email(),
                dados.entrada(),
                dados.saida(),
                dados.salario(),
                dados.pis(),
                new Endereco(dados.endereco().getLogradouro(), dados.endereco().getBairro(), dados.endereco().getCep(), dados.endereco().getNumero(), dados.endereco().getComplemento(), dados.endereco().getCidade(), dados.endereco().getUf()));

        _repository.save(funcionario);
    }
}
