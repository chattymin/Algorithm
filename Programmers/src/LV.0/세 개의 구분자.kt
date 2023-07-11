package LV.`0`

fun main() {
    println(solution15("cabab").toList())
}

fun solution15(myStr: String): Array<String> = myStr.split(Regex("[abc]")).filterNot { it.isEmpty() }.ifEmpty { listOf("EMPTY") }.toTypedArray()