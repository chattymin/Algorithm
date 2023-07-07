package LV.`0`

fun main() {
    println(solution8("abstract algebra"))
}

fun solution8(myString: String): String = myString.map { if(it == 'a' || it == 'A') it.uppercaseChar() else it.lowercaseChar() }.joinToString("")