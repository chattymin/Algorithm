package LV.`0`

fun main() {
    println(solution18(intArrayOf(1,2,3,4,5,6)).toList())
}

/*
fun solution18(arr: IntArray): IntArray {
    var answer: IntArray = arr

    repeat(getNum(arr.size)){
        answer = answer.plus(0)
    }

    return answer
}

fun getNum(size: Int): Int{
    var two = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512)

    two.forEach {
        if (it >= size)
            return it - size
    }

    return 1024 - size
}

 */

fun solution18(arr: IntArray): IntArray {
    val size = arr.size
    var n = 1

    while (n <= size) n *=2

    return arr + IntArray(n-size){0 }
}

