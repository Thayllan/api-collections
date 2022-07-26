package one.digitalInnovation.collections

fun main() {
    val joao = Funcionarios("João",2000.0,"CLT")
    val pedro = Funcionarios("Pedro",1500.0,"PJ")
    val roberto = Funcionarios("Roberto",3000.0,"CLT")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(roberto)

    val resultuniao = funcionarios1.union(funcionarios2)
    resultuniao.forEach { println(it) }

    println("-----------------------")
    val funcionarios3 = setOf(joao, pedro, roberto)
    val resultsub = funcionarios3.subtract(funcionarios2)
    resultsub.forEach { println(it) }

    println("-----------------------")
    val resultInter = funcionarios3.intersect(funcionarios2)
    resultInter.forEach { println(it) }
}