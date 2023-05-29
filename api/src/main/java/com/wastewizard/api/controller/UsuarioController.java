package com.wastewizard.api.controller;

import com.wastewizard.api.Usuario.Usuario;
import com.wastewizard.api.Usuario.UsuarioRepository;
import com.wastewizard.api.Usuario.UsuarioRequest;
import com.wastewizard.api.Usuario.UsuarioValidation;
import com.wastewizard.api.funcionario.Endereco;
import com.wastewizard.api.funcionario.Funcionario;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioRepository _repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody UsuarioRequest dados) {
        Usuario usuario = new Usuario(
                null,
                dados.nome(),
                dados.cpf(),
                dados.email(),
                dados.senha(),
                dados.admin());

        _repository.save(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(UsuarioValidation usuario){
        Usuario usuarioEncontrado = _repository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());

        if(usuarioEncontrado == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok("Ok!");
    }

}
