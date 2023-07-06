package LV.`0`

import kotlin.math.round

fun main() {
    println(solution1(
        arrayOf(
            intArrayOf(1, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 1))
    ))
}

fun solution1(board: Array<IntArray>): Int {
    var room = board
    val size1 = board.get(0).size
    val size2 = board.size

    for (i in 0 until  size2){
        for (j in 0 until   size1){
            if (board[i][j] != 1) continue
            val left = j - 1
            val right = j + 1
            val up = i + 1
            val down = i - 1

            if (check(left, size1)) if (board[i][left] == 0)board[i][left] = 2
            if (check(right, size1)) if (board[i][right] == 0)board[i][right] = 2
            if (check(up, size2)) if (board[up][j] == 0)board[up][j] = 2
            if (check(down, size2)) if (board[down][j] == 0)board[down][j] = 2
            if (check(left, size1) && check(up, size2)) if (board[up][left] == 0)board[up][left] = 2
            if (check(left, size1) && check(down, size2)) if (board[down][left] == 0)board[down][left] = 2
            if (check(right, size1) && check(up, size2)) if (board[up][right] == 0)board[up][right] = 2
            if (check(right, size1) && check(down, size2)) if (board[down][right] == 0)board[down][right] = 2

        }
    }

    var answer: Int = room.map { it.filter {num-> num == 0 }.count() }.sum()


    return answer
}

fun check(target: Int, len: Int): Boolean = (target >= 0 && target < len)

// bfs활용?