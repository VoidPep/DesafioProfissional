package com.wastewizard.api.Usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record UsuarioRequest(
        @NotBlank
        String nome,
        @NotBlank
        String cpf,
        @NotBlank @Email
        String email,
        @NotBlank
        String senha,
        boolean admin) { }

