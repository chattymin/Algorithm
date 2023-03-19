fun main() {
    println(solution2("abc1Addfggg4556b", 6).toList().toString())
}

fun solution2(my_str: String, n: Int): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    var check = false

    for (i in 0 until  my_str.length step (n)){
        if (i + n <= my_str.length) {
            answer = answer.plus(my_str.slice(i until i + n))
        }else check = true
    }

    if (check)
        answer = answer.plus(my_str.slice(my_str.length/n * n until my_str.length))


    return answer
}