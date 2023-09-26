package LV.`1`

fun main() {

    fun solution(s: String): Int = s
        .replace("zero", "0")
        .replace("one", "1")
        .replace("two", "2")
        .replace("three", "3")
        .replace("four", "4")
        .replace("five", "5")
        .replace("six", "6")
        .replace("seven", "7")
        .replace("eight", "8")
        .replace("nine", "9")
        .toInt()
    /*
    fun solution(s: String): Int {
        val numList = listOf(
            Pair("zero", "0"),
            Pair("one", "1"),
            Pair("two", "2"),
            Pair("three", "3"),
            Pair("four", "4"),
            Pair("five", "5"),
            Pair("six", "6"),
            Pair("seven", "7"),
            Pair("eight", "8"),
            Pair("nine", "9")
        )

        var str: StringBuilder = StringBuilder()
        str.append(s)

        var answer = 0

        while (str.length > 0){
            var temp = str[0].toString()
            var index = 1

            numList.forEach {
                if (str.startsWith(it.first)){
                    temp = it.second
                    index = it.first.length
                }
            }

            answer = answer * 10 + temp.toInt()
            str.delete(0, index)
        }
        return answer
    }

     */

    println(solution("one4seveneight"))
}