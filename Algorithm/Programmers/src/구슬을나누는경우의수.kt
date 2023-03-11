import java.math.BigInteger

fun main() {
    println(solution(3, 2))
}

fun solution(balls: Int, share: Int): BigInteger = (factorial(balls)) / ((factorial(balls - share) * factorial(share)))

fun factorial(time: Int): BigInteger {
    var result: BigInteger = BigInteger("1")
    for (i in 2..time) result = result * i.toBigInteger()
    println(result)
    return result
}
