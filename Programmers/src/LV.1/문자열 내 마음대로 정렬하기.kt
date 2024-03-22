package LV.`1`

fun main() {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()

        val map = mutableListOf<Pair<Char, String>>()

        strings.forEach{
            map += Pair(it[n], it)
        }

        map.sortBy{
            it.second
        }
        map.sortBy{
            it.first
        }

        map.forEach{
            answer += it.second
        }

        return answer
    }

    println(solution(arrayOf("abce", "abcd", "cdx"), 2).toList())
}
