package LV.`1`

fun main() {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val row = board.size
        val col = board[0].size
        val answer = mutableListOf<Int>()
        var count = 0

        for (m in moves) {
            for (i in 0 until row) {
                if (board[i][m - 1] != 0) {
                    answer.add(board[i][m - 1])
                    board[i][m - 1] = 0
                    break
                }
            }

            if (answer.size > 1 && answer[answer.size - 2] == answer[answer.size - 1]) {
                answer.removeAt(answer.size - 1)
                answer.removeAt(answer.size - 1)
                count += 2
            }
        }
        return count
    }

    println(
        solution(
            arrayOf(
                intArrayOf(0,0,0,0,0),
                intArrayOf(0,0,1,0,3),
                intArrayOf(0,2,5,0,1),
                intArrayOf(4,2,4,4,2),
                intArrayOf(3,5,1,3,1)
            ),
            intArrayOf(1,5,3,5,1,2,1,4)
        )
    )
}
