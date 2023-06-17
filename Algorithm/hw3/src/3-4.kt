fun main() {
    val A = intArrayOf(31, -41, 59, 26, -53, 58, 97, -93, -23, 84) // input

    var start = 0
    var end = 0
    var maxSum = A[0]

    val len = A.size
    for (i in 1 until len){
        if (A[i] < A[i-1] + A[i]) // 현재값보다 현재값+이전값이 더 크다면 현재값을 덮어쓰기
            A[i] = A[i-1] + A[i]
        else
            start = i // 현재값이 현재값+이전값 보다 크다면 이전값은 최대배열에 도움이 되지않기때문에 시작변수 변경

        if (maxSum < A[i]){ // 지금까지의 최댓값보다 현재 값이 더 크면 배열의 최대길이가 늘어난 것이기 때문에 end와 maxSum 수정
            end = i
            maxSum = A[i]
        }
    }

    println("시작 : $start, 종료 : $end, 최댓값 : $maxSum")
}

