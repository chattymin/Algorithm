package LV.`0`

fun main() {
    println(solution(arrayOf("left", "right", "up", "right", "right"), intArrayOf(11,11) ).toList().toString())
}

fun solution(keyinput: Array<String>, board: IntArray): IntArray {
    var x = 0
    var y = 0

    for (i in keyinput){
        when(i) {
            "left" -> x -= 1
            "right" -> x += 1
            "up" -> y += 1
            "down" -> y -= 1
        }
        if (x>board[0]) x = board[0]/2
        if (x<-board[0]) x = -board[0]/2
        if (y>board[1]) y = board[1]/2
        if (y<-board[1]) y = -board[1]/2
    }


    return intArrayOf(x,y)
}