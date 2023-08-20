package LV.`1`

fun main() {
    println(solution5(626331))
}

fun solution5(num: Int): Int {
    var number: Long = num.toLong()
    var answer = 0

    while (answer < 500){
        if (number == 1L) return answer

        if (number % 2 == 0L) number /= 2
        else number = number * 3 + 1
        answer++
    }

    return -1
}