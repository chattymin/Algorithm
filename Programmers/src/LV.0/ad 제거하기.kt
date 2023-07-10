package LV.`0`

fun main() {
    println(solution6(arrayOf("and","notad","abcd")).toList())
}

fun solution6(strArr: Array<String>): Array<String> = strArr.filter { !it.contains("ad") }.toTypedArray()