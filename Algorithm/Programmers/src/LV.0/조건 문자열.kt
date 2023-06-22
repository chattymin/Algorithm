package LV.`0`

fun main() {
    println(solution("<", "=", 20, 50))
}

fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
    when(ineq){
        "<" -> {
            when(eq){
                "=" -> if (n <= m) return 1
                "!" -> if (n < m) return 1
            }
        }
        ">" -> {
            when(eq){
                "=" -> if (n >= m) return 1
                "!" -> if (n > m) return 1
            }
        }
    }
    return 0
}