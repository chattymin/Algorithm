package LV.`0`

fun main() {
    println(solution6(5, 555).toList())
}

fun solution6(l: Int, r: Int): IntArray {
    var answer: IntArray = intArrayOf()

    for (i in l .. r){
        var temp = i.toString().toSet()
        if ((temp.size == 2 && temp.contains('5') && temp.contains('0')) || (temp.size == 1 && temp.contains('5')) || i == 5)
            answer = answer.plus(i)
    }

    if (answer.isEmpty())
        answer = answer.plus(-1)

    return answer
}