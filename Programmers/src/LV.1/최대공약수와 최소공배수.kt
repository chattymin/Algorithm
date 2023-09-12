package LV.`1`

fun main() {
    tailrec fun gcd(num1: Int, num2: Int): Int= if(num2 == 0) num1 else gcd(num2, num1 % num2)

    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n,m)
        return intArrayOf(gcd, (n * m / gcd))
    }

    println(solution(3, 12).toList())
}