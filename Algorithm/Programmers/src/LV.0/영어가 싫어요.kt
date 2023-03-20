fun main() {
    println(solution10("onetwothreefourfivesixseveneightnine"))
}

fun solution10(numbers: String): Long{
    var str = numbers
    val number = mapOf<String, String>(
        "one" to "1", "two" to "2", "three" to "3", "four" to "4", "five" to "5", "six" to "6",
        "seven" to "7", "eight" to "8", "nine" to "9", "zero" to "0"
    )

    for (i in number){
        str = str.replace(i.key, i.value)
    }

    return str.toLong()
}