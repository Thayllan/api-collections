package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0,"PJ")
    val roberto = Funcionario("Roberto",3000.0,"CLT")

    val funcionarios = mutableListOf(joao, roberto)
    funcionarios.forEach { println(it) }
    println("---------------List--------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("---------------Add---------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------------Set----------------------------")
    val funcionarioSet= mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("---------------Set----------------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(roberto)
    funcionarioSet.forEach { println(it) }

    println("---------------Remove----------------------------")
    funcionarioSet.remove(roberto)

    funcionarioSet.forEach { println(it) }

}