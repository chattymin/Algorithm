package LV.`0`

fun main() {
    println(solution3(arrayOf(intArrayOf(80,70), intArrayOf(90,50), intArrayOf(40,70), intArrayOf(50,80))).toList())
}

fun solution3(score: Array<IntArray>): IntArray {
    var answer: IntArray = IntArray(score.size)
    val temp = score.map { (it.first().toFloat() + it.last())/2 }.toList()
    val temp2 = temp.toSet().sortedDescending().toList()

    var sum = 0
    for (i in 0 until temp2.size){
        var count = 0
        for (j in 0 until temp.size){
            if (temp2[i] == temp[j]){
                answer.set(j,i +1 + sum)
                count++
            }
        }
        if (count > 1) sum += count - 1
    }

    return answer
}