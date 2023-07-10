package LV.`0`

fun main() {
    println(solution12("axbxcxdx").toList())
}

fun solution12(myString: String): Array<String> = myString.split("x").filterNot { it.isEmpty() }.sorted().toTypedArray()