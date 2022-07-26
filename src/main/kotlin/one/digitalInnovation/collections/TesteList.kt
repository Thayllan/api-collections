package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",1500.0,"PJ")
    val roberto = Funcionario("Roberto",3000.0,"CLT")

    val funcionarios = listOf(joao, pedro, roberto)

    funcionarios.forEach { println(it) }
    println("--------------------------------")
    println(funcionarios.find { it.nome == "Roberto"  })

    println("--------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("--------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: ${nome}
            Salário: ${salario}
        """.trimIndent()}