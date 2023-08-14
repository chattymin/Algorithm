package LV.`1`

fun main() {
    println(solution2(121L))
}

fun solution2(n: Long): Long = n.toString().toList().sortedDescending().joinToString("").toLong()