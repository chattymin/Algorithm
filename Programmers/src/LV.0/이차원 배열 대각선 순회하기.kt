package LV.`0`

fun main() {
    println(solution(arrayOf(intArrayOf(0,1,2), intArrayOf(1,2,3), intArrayOf(2,3,4), intArrayOf(3,4,5)), 2))
}

fun solution(board: Array<IntArray>, k: Int): Int {
    var sum = 0
    for (i in 0 until board.size){
        for (j in 0 until board[i].size)
            if (i + j <= k) sum += board[i][j]
    }
    return sum
}