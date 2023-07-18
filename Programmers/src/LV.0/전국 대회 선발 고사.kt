package LV.`0`

fun main() {
    println(solution1(intArrayOf(3, 7, 2, 5, 4, 6, 1), booleanArrayOf(false, true, true, true, true, false, false)))
}

fun solution1(rank: IntArray, attendance: BooleanArray): Int {
    var result = intArrayOf()
    for (i in 0 until rank.size){
        if (attendance[i])
            result = result.plus(rank[i])
    }
    result.sort()

    return rank.indexOf(result[0]) * 10000 + rank.indexOf(result[1]) * 100 + rank.indexOf(result[2])
}