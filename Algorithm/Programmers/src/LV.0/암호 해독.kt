fun main() {
    println(solution("dfjardstddetckdaccccdegk", 4))
}

fun solution(cipher: String, code: Int) = cipher.filterIndexed{index,_ -> (index+1) % code == 0 }