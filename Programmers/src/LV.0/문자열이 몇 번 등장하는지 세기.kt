package LV.`0`

fun main() {
    println(solution9("banana", "ana"))
}

fun solution9(myString: String, pat: String): Int {
    var count = 0
    for (i in 0 .. myString.length - pat.length)
        if (myString.slice(i until  i + pat.length) == pat)
            count++

    return count
}