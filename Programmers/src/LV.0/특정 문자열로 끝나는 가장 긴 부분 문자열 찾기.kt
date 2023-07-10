package LV.`0`

fun main() {
    println(solution8("AAAAaaaa", "a"))
}

fun solution8(myString: String, pat: String): String = myString.slice(0 until myString.length - myString.reversed().indexOf(pat.reversed()))

// fun solution8(myString: String, pat: String): String = myString.slice(0 ..  myString.lastIndexOf(pat))


// abcdefg -> ef -> 4
// gfedcba -> fe -> 1