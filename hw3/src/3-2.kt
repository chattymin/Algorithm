import kotlin.math.max

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() } // N 과 M 입력
    val map = Array(N+1){IntArray(N+1){0} } // (N+1) x (N+1) 크기의 배열을 0으로 초기화

    repeat(M){ // M번 반복
        var (x,y) = readln().split(" ").map { it.toInt() } // x, y를 입력받은 후, 치즈가 있는 위치를 1로 변경
        map[x][y] = 1
    }

    for (i in 1 .. N){ // 1부터 N까지 반복
        for (j in 1 .. N){ // 1부터 N까지 반복
            map[i][j] = max(map[i-1][j], map[i][j-1]) + map[i][j] // 현재 값 = 왼쪽과 아래중 더 큰값 + 현재 값
        }
    }

    println(map[N][N])
}

