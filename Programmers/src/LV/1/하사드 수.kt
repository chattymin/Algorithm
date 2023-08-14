package LV.`1`

fun main() {
    println(solution4(21))
}

fun solution4(x: Int): Boolean = (x % (x.toString().sumOf { it.digitToInt() })) == 0