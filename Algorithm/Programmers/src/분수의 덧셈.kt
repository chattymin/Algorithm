fun main() {
    println(solution(1,2,3,4).toString())
}

fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int) = intArrayOf(numer1 * lcm(denom1,denom2)/denom1 + numer2 * lcm(denom1,denom2)/denom2, lcm(denom1,denom2)).toList()

fun gcd(num1: Int, num2: Int): Int = if (num2 == 0) num1 else gcd(num2, num1 % num2)

fun lcm(n:Int, m:Int) = n * m / gcd(n, m)