package com.wastewizard.api.funcionario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record FuncionarioRequest(
        @NotBlank
        String nome,
        @NotBlank
        String cpf,
        @NotBlank @Email
        String email,
        @NotBlank
        String entrada,
        @NotBlank
        String saida,
        @NotBlank
        BigDecimal salario,
        @NotBlank
        String pis,
        @NotNull @Valid
        Endereco endereco)
{
}
