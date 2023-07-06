fun main() {
    println(solution0(12))
}

fun solution0(n: Int): IntArray {
    var answer: MutableList<Int> = arrayListOf()
    var num = n

    for (i in 2..n) {
        if (num == 1) break
        while (num % i == 0) {
            num /= i
            answer.add(i)
        }
    }
    return answer.toSet().toIntArray()
}