import kotlin.math.min

fun main() {
    println(solution8(15))
}

fun solution8(n: Int) = n - countPrimes(n)

fun countPrimes(size: Int): Int{
    var count = 0

    for (i in 1..size) {
        if (miniCount(i)) count++
    }

    return count
}

fun miniCount(n: Int): Boolean{
    for (j in 2 until n)
        if (n % j == 0) return false
    return true
}