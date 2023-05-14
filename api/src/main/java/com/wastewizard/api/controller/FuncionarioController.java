package com.wastewizard.api.controller;

import com.wastewizard.api.funcionario.FuncionarioRequest;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @PostMapping
    public void cadastrar(@RequestBody FuncionarioRequest funcionario) {
        System.out.println(funcionario);
    }
}
