package LV.`0`

fun main() {
    println(solution5(intArrayOf(3,4,5,2,1)))
}

fun solution5(num_list: IntArray): Int {
    var odd : String = ""
    var even : String = ""

    num_list.forEach {
        if (it % 2 == 0) even += it.toString()
        else odd += it.toString()
    }

    return even.toInt() + odd.toInt()
}