fun main(){
    println(10/3)
    println(8/3)
    println(6/3)
    println(solution9(intArrayOf(10,8,6), 3))
}

fun solution9(box: IntArray, n: Int) = (box[0]/n) * (box[1]/n) * (box[2]/n)
