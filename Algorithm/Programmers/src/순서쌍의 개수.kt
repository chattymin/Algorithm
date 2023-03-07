fun main() {
    println(solution(20))
}

fun solution(n: Int) = (1..n).count { n % it == 0 }