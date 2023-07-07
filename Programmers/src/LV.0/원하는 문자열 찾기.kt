package LV.`0`

fun main() {
    println(solution6("AbCdEfG", "aBc"))
}

fun solution6(myString: String, pat: String): Int = if (myString.toLowerCase().contains(pat.toLowerCase())) 1 else 0