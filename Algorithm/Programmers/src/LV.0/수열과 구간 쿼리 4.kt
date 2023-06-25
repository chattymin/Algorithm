package LV.`0`

fun main() {
    println(solution2(intArrayOf(0,1,2,4,3), arrayOf(intArrayOf(0,4,1), intArrayOf(0,3,2), intArrayOf(0,3,3))).toList())
}

fun solution2(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = arr

    queries.forEach {
        for(i in it[0] .. it[1]){
            if (i % it[2] == 0) answer[i]++
        }
    }
    return answer
}