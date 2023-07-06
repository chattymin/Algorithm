package LV.`0`

fun main() {
    println(solution0(arrayOf(intArrayOf(0, 1), intArrayOf(2, 5), intArrayOf(3, 9))))
}

fun solution0(lines: Array<IntArray>): Int {
    // 1. arr 배열 및 변수 초기화
    val arr = IntArray(200)
    var answer = 0

    // 2. lines 정보를 arr 배열에 적용
    for (line in lines) for (j in line[0] + 100 until line[1] + 100) arr[j]++

    // 3. arr 배열에서 겹친 부분 세기
    answer = arr.filter { it > 1 }.count()
    return answer
}