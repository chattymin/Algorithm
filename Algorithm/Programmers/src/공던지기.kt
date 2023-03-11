fun main(){
    println(solution3(intArrayOf(1,2,3,4,5,6), 5))
}

fun solution3(numbers: IntArray, k: Int) = numbers[((k-1)*2)%numbers.size]