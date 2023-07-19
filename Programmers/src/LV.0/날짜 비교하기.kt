package LV.`0`

fun main() {
    println(solution3(intArrayOf(2021, 12, 28), intArrayOf(2021, 12, 29)))
}

fun solution3(date1: IntArray, date2: IntArray): Int {
    if (date1[0] < date2[0])
        return 1
    else if (date1[0] < date2[0])
        return 0

    if (date1[1] < date2[1])
        return 1
    else if (date1[1] > date2[1])
        return 0

    if (date1[2] < date2[2])
        return 1

    return 0
}