package LV.`0`

fun main() {
    println(solution1("ihrhbakrfpndopljhygc", 4, 2))
}

fun solution1(my_string: String, m: Int, c: Int): String = (c-1 until my_string.length step m).map { my_string[it] }.joinToString("")

/*
{
    var answer: String = ""

    for (i in c-1 until my_string.length step m){
        answer += my_string[i]
    }

    return answer
}

 */