@file:Suppress("NAME_SHADOWING")

package one.digitalInnovation.collections

fun main() {
    val names = Array(3) {""}
    names[0] = "Maria"
    names[1] = "João"
    names[2] = "Thayllan"

    for (names in names) {
        println(names)
    }
    println("---------------------------")
    names.sort()
    names.forEach { println(it) }

    val names2 = arrayOf("Maria", "Zazá", "Pedro")
    println("---------------------------")
    names2.sort()
    names2.forEach { println(it) }
}