package LV.`0`

fun main() {
    println(solution18("0010"))
}

fun solution18(n_str: String): String {
    var result = n_str

    while (result.startsWith('0')){
        result = result.slice(1 until result.length)
    }

    return result
}
//fun solution18(n_str: String): String = n_str.toInt().toString()