fun main() {
    println(solution1(29183,1))
}

fun solution1(num: Int, k: Int) = "-$num".indexOf(k.toString())

//fun solution(num: Int, k: Int) : Int{
//    for (i in num.toString()) {
//        if (i - '0' == k)
//            return num.toString().indexOf(i) + 1
//    }
//
//    return -1
//}