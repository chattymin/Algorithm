fun main() {
    println(solution4(intArrayOf(1,2,3,4,5,6,7,8,9,10)))
}

fun solution4(number: IntArray) = number.sum() / number.size.toDouble()