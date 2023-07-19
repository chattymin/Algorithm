package LV.`0`

fun main() {
    println(solution7(arrayOf("cafelatte", "americanoice", "hotcafelatte", "anything")))
}

fun solution7(order: Array<String>): Int = order.count { it.contains("cafelatte") } * 5000 + (order.size - order.count { it.contains("cafelatte") })*4500