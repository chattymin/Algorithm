package LV.`0`

fun main() {
    println(solution4(arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")))
}

fun solution4(names: Array<String>): Array<String> = (0 until names.size step 5).map { names[it] }.toTypedArray()