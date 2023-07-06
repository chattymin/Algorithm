package LV.`0`

fun main() {
    println(solution2(4,14).toList())
}

fun solution2(num: Int, total: Int): IntArray =
    if (num%2 == 0) (((total / num) - num / 2 + 1) .. ((total / num) + num / 2)).toList().toIntArray()
    else (((total / num) - num / 2) .. ((total / num) + num / 2)).toList().toIntArray()