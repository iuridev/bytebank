package models

import models.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val tipo = "models.Gerente"
    override val bonificacao = salario * 0.3
}