import kotlin.math.absoluteValue

fun main() {
    println(solution1(intArrayOf(3,10,28), 20))
}

fun solution1(array: IntArray, n: Int) = array.sorted().minWithOrNull(compareBy { (it - n).absoluteValue })!!