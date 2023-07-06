fun main() {
    println(solution3(6))
}

fun solution3(n: Int) = n / gcd1(n,6)

tailrec fun gcd1(n:Int, m:Int): Int = if (m == 0) n else gcd1(m, n%m)