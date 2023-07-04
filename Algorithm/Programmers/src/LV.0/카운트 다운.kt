package LV.`0`

fun main() {
    println(solution9(10, 3).toList())
}

//fun solution9(start: Int, end: Int): IntArray = (end .. start).toList().reversed().toIntArray()
fun solution9(start: Int, end: Int): IntArray = (start downTo end).toList().toIntArray()