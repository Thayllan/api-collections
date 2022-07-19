package one.digitalInnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 10
    values[2] = 3
    values[3] = 40
    values[4] = 5
    println("-----------------------------------------")
    println("valor in values")
    for(valor in values){
        println(valor)
    }
    println("-----------------------------------------")
    println("forEach")
    values.forEach {
        println(it) //O "it" substitui o valor
    }

    println("-----------------------------------------")
    println("index in values.indices")
    for (index in values.indices){
        println(values[index])
        println(index)//apresentar indice do array
    }
    println("-----------------------------------------")
    println("sort()")
    values.sort()

    for (valor in values){
        println(valor)
    }
}