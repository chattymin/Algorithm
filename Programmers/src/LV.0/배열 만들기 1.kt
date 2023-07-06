package LV.`0`

fun main() {
    println(solution8(10, 3).toList())
}

fun solution8(n: Int, k: Int): IntArray = (k .. n step k).toList().toIntArray()