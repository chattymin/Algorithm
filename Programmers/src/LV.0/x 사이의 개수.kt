package LV.`0`

fun main() {
    println(solution11("oxooxoxxox").toList())
}

fun solution11(myString: String): IntArray = myString.split("x").map { it.length }.toIntArray()