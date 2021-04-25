open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val tipo = "comum"
    open val bonificacao : Double
        get() = salario * 0.1
}



