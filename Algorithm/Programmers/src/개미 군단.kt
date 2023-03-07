fun main() {
    println(solution1(999))
}

fun solution1(hp: Int) = hp/5 + (hp%5)/3 + (hp%5%3)