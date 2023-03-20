fun main() {
    println(solution11("hello"))
}

fun solution11(s: String) = s.filter {ch -> s.filter { it == ch }.count() == 1 }.toSortedSet().joinToString("")