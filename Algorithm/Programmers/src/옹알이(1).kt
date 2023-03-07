fun main() {
    val input: Array<String> = arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
    println(solution(input))
}

fun solution(babbling: Array<String>): Int {
    val example: Array<String> = arrayOf("aya", "ye", "woo", "ma")
    var answer = 0

    babbling.forEach {
        var canSlice = false
        var str = it
        while (true){
            for (i in example){
                if (str.startsWith(i)){
                    if (i.length != str.length){
                        str = str.slice(i.length  .. str.length-1)
                        canSlice = true
                        break;
                    }
                    answer++
                    break
                }
            }
            if (!canSlice) break
            canSlice = false
        }
    }
    return answer
}