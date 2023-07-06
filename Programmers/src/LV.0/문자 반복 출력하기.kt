fun main() {
    println(solution1("hello", 3))
}

fun solution1(my_string: String, n: Int) = my_string.map { it.toString().repeat(n) }.joinToString("")