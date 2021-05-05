package models

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val tipo = ""
    abstract val bonificacao : Double
}



