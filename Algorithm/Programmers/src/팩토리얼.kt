fun main() {
    println(solution6(5))
}

fun solution6(n: Int) = (2..n).find { n < factorials(it) }?.dec() ?: n

private tailrec fun factorials(n: Int, run: Int = 1): Int = if (n == 1) run else factorials(n - 1, run * n)