package LV.`1`

fun main() {
    println(solution3(13))
}
fun solution3(n: Int) = (1..n).first { n % it == 1 }