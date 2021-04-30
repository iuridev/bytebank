class CalculadoraBonificacao {

    var total : Double = 0.0
        private set

    fun totalBonificacao( funcionario: Funcionario ) {
        total += funcionario.bonificacao
    }

}