package com.wastewizard.api.funcionario;

import java.math.BigDecimal;

public record FuncionarioRequest(
        String nome,
        String cpf,
        String horarioDeEntrada,
        String horarioDeSaida,
        BigDecimal salario,
        String pis)
{
}
