package LV.`0`

fun main() {
    println(solution5(arrayOf("aBc", "AbC")))
}

fun solution5(strArr: Array<String>): Array<String> = strArr.mapIndexed { index, s -> if (index % 2 == 0) s.lowercase() else s.uppercase() }.toTypedArray()