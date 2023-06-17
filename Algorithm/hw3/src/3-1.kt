fun main(){
    val N = readLine()!!.toInt()

    when(N){ // 1이면 1, 2이면 2, 3이면 4를 출력하고, 그 이상일 경우 getResult라는 함수를 이용하여 값을 구한 후 출력.
        1 -> println("1")
        2 -> println("2")
        3 -> println("4")
        else -> println(getResult(N))
    }
}

fun getResult(N: Int): Int{
    var fir = 1
    var sec = 2
    var thi = 4
    var result = 0

    // 점화식 : A[n] = A[n-1] + A[n-2] + A[n-3]
    // 배열을 사용하지 않고, 변수 4개를 사용한다면 메모리적으로 이득이 있어 아래와 같은 방법 사용.
    for (i in 4 .. N){ // 4부터 N까지 반복하여 결과를 구함.
        result = fir + sec + thi
        fir = sec
        sec = thi
        thi = result
    }

    return result
}



