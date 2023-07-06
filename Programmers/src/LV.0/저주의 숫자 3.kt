package LV.`0`

fun main() {
    println(solution(15))
}

fun solution(n: Int): Int {
    var result: MutableList<Int> = mutableListOf(0)

    repeat(n){ index ->
        var temp = result[index] + 1
        while (temp.toString().contains("3") || temp % 3 == 0) temp++
        result.add(temp)
    }

    return result.last()
}