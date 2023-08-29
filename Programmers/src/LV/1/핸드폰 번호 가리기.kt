package LV.`1`

fun main() {
    println(solution1("01033334444"))
}

fun solution1(phone_number: String): String {
    var answer = ""

    repeat(phone_number.length - 4){
        answer += "*"
    }

    answer += phone_number.slice(phone_number.length - 4 until phone_number.length)

    return answer
}