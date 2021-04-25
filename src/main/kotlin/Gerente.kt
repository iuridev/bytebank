class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val tipo = "Gerente"
    override val bonificacao = salario * 0.3
}