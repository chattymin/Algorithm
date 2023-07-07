package LV.`0`

fun main() {
    println(solution13(intArrayOf(1,2,3,100,99,98)))
}

fun solution13(arr: IntArray): Int {
    var arr1 = arr
    var arr2: IntArray
    var count = 0

    while (true){
        arr2 = arr1.map {
            if (it < 50 && it % 2 == 1)
                it * 2 + 1
            else if (it >= 50 && it % 2 == 0)
                it / 2
            else
                it
        }.toIntArray()

        if (arr1.contentEquals(arr2)) return count

        arr1 = arr2
        count++
    }
}