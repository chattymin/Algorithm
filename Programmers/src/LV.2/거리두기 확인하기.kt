package LV.`2`


fun main() {
    println(solution(arrayOf(
        arrayOf(
            "POOOP",
            "OXXOX",
            "OPXPX",
            "OOXOX",
            "POXXP"),
        arrayOf(
            "POOPX",
            "OXPXP",
            "PXXXO",
            "OXXXO",
            "OOOPP"),
        arrayOf(
            "PXOPX",
            "OXOXP",
            "OXPOX",
            "OXXOP",
            "PXPOX"),
        arrayOf(
            "OOOXX",
            "XOOOX",
            "OOOXX",
            "OXOOX",
            "OOOOO"),
        arrayOf(
            "PXPXP",
            "XPXPX",
            "PXPXP",
            "XXXXX",
            "XXPOP")
    )).toList().toString())
}

fun solution(places: Array<Array<String>>): IntArray {
    var answer: IntArray = intArrayOf()

    for (place in places){
        val room = arrayOf(place[0].split(""), place[1].split(""),place[2].split(""),place[3].split(""),place[4].split(""))
        answer = answer.plus(checkPlace(room))
    }

    return answer
}

fun checkPlace(room: Array<List<String>>): Int{
    for (i in 0 until 5){
        for (j in 1 .. 5){
            if (room.get(i).get(j) == "P") if (atP(i,j,room)) return 0
            if (room.get(i).get(j) == "O") if(atO(i,j,room)) return 0
        }
    }
    return 1
}

fun checkX(num: Int): Boolean = num < 5 && num >= 0
fun checkY(num: Int): Boolean = num < 6 && num >= 1

fun isP(x: Int, y: Int, room: Array<List<String>>): Boolean = room.get(x).get(y) == "P"

fun atP(x: Int, y: Int, room: Array<List<String>>): Boolean{ // 사람 옆이니까 사람이 한명도 존재하면 안됨. return 0
    val left = y - 1
    val right = y + 1
    val up = x + 1
    val down = x - 1
    if (checkY(left))
        if (isP(x,left,room)) return true
    if (checkY(right))
        if (isP(x,right,room)) return true
    if (checkX(up))
        if (isP(up,y,room)) return true
    if (checkX(down))
        if (isP(down,y,room)) return true
    return false
}

fun atO(x: Int, y: Int, room: Array<List<String>>): Boolean { // 빈테이블 옆이니까 사람이 두명이상 존재하면 안됨. return 0
    var cnt = 0
    val left = y - 1
    val right = y + 1
    val up = x + 1
    val down = x - 1
    if (checkY(left))
        if (isP(x,left,room)) cnt++
    if (checkY(right))
        if (isP(x,right,room)) cnt++
    if (checkX(up))
        if (isP(up,y,room)) cnt++
    if (checkX(down))
        if (isP(down,y,room)) cnt++
    if (cnt >= 2) return true
    return false
}