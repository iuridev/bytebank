fun main(){
    println("Bem vindo ao Bytebank")
    val name = "iuri"
    println("Titular $name")

    //criando funcionario
    val iuri = Funcionario( "Iuri", "123.456.789-10", 1500.0)
    println("Nome: ${iuri.nome}")
    println("CPF:: ${iuri.cpf}")
    println("Salário: ${iuri.salario}")
    println("Bonificação: ${iuri.bonificacao}")
    println("Função: ${iuri.tipo}")


    //criando Gerente
    val maria = Gerente("Maria", "125.584.586-87", 3500.0)
    println("Nome: ${maria.nome}")
    println("CPF:: ${maria.cpf}")
    println("Salário: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")
    println("Função: ${maria.tipo}")

}