package LV.`0`

fun main() {
    println(solution13("43 + 12"))
}

fun solution13(myString: String): Int{
    var sp = myString.split(" ")

    return when(sp[1]){
        "+" -> sp[0].toInt() + sp[2].toInt()
        "-" -> sp[0].toInt() - sp[2].toInt()
        "*" -> sp[0].toInt() * sp[2].toInt()
        else -> 0
    }
}