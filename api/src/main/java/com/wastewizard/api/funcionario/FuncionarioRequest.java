package com.wastewizard.api.funcionario;

import java.math.BigDecimal;

public record FuncionarioRequest(
        String nome,
        String cpf,
        String email,
        String entrada,
        String saida,
        BigDecimal salario,
        String pis,
        Endereco endereco)
{
}
