fun main() {
    println(solution9(29))
}

fun solution9(n: Int) = (1..n).filter { n % it == 0 }