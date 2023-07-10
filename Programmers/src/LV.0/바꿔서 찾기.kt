package LV.`0`

fun main() {
    println(solution10("ABBAA", "AABB"))
}

fun solution10(myString: String, pat: String): Int = if (myString.contains(pat.map { if (it == 'A') 'B' else 'A' }.joinToString(""))) 1 else 0
