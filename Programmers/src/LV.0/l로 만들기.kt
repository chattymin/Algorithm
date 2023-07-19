package LV.`0`

fun main() {
    println(solution19("abcdevwxyz"))
}

fun solution19(myString: String): String = myString.map { if (it < 'l') 'l' else it}.joinToString("")