fun main() {
    println(solution4(29423))
}

fun solution4(order: Int) = order.toString().count { it == '3' || it == '6' || it == '9' }