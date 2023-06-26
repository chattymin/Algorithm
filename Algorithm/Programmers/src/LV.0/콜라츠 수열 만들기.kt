package LV.`0`

fun main() {
    println(solution7(10).toList())
}

fun solution7(n: Int): IntArray {
    var num = n
    var answer: IntArray = intArrayOf()

    do {
        answer = answer.plus(num)

        if (num % 2 == 0){
            num /= 2
        }else{
            num = num * 3 + 1
        }
    }while (num != 1)

    return answer.plus(1)
}