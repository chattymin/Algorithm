fun main() {
    println(solution11(23))
}

fun solution11(age: Int) = age.toString().map { it+49 }.joinToString("")