package one.digitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)
    for(salrio in salarios){
        println(salrio)
    }
    println("_-_-_-_-_-_-_-_")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("_-_-_-_-_-_-_-_")
    salariosMaiorQue2500.forEach { println(it) }

    println("_-_-_-_-_-_-_-_")
    println(salarios.count { it in 2000.0 ..5000.0 })

    println(salarios.find { it == 2255.0 })
    println(salarios.any { it == 1000.0})

}