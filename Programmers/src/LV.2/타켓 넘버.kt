package LV.`2`

fun main() {
    fun dfs(numbers: IntArray, target: Int, index: Int, num: Int, size: Int): Int {
        return if(index == size) {
            if(target == num) 1 else 0
        } else {
            dfs(numbers, target, index + 1, num + numbers[index], size) + dfs(numbers, target, index + 1, num - numbers[index], size)
        }
    }

    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0, 0, numbers.size)
    }

    println(solution(intArrayOf(1,1,1,1,1), 3))
}
