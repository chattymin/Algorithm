fun main() {
    val K = readln().toInt()
    val dp = IntArray(K+1){0}

    val coin = intArrayOf(0,1,4,7,13,28,52,91,365) // 동전 종류
    val len = coin.size

    repeat(len-1){ // 해당 금액의 동전이 있는 경우 해당 금액은 1개로 해결되기 때문에 1로 초기화
        if (K >= coin[it+1])
            dp[coin[it+1]] = 1
    }

    var min: Int
    for (i in 1 ..  K){
        min = 999999999 // 비교값 초기화
        for (j in 1 until len){
            if (i >= coin[j]){ // 동전보다 현재 금액이 클 경우
                if (min > dp[i - coin[j]]) // 현재까지의 최소갯수보다 해당 금액을 지불하는데 사용되는 동전의 갯수가 더 작을경우
                    min = dp[i - coin[j]]
            }
        }

        if (dp[i] == 0) // 해당 금액의 동전이 없는 경우
            dp[i] = min + 1
    }

    println(dp[K])
}



