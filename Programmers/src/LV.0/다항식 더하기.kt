package LV.`0`

fun main() {
    println(solution("7 + x"))
}

fun solution(polynomial: String): String {
    var num = 0
    var x = 0
    var answer = ""

    val poly = polynomial.split(" ")

    for (i in poly){
        if (i.contains("x")){
            var temp = i.replace("x", "")
            if (temp.length > 0) x += temp.toInt()
            else x++
        }else if (i != "+") num += i.toInt()
    }
    if (x > 0){
        if (num > 0) {
            if (x == 1) answer = "x + $num"
            else answer = "${x}x + $num"
        }else{
            if (x == 1) answer = "x"
            else answer = "${x}x"
        }
    }else{
        if (num > 0) {
            answer = "$num"
        }
    }

    return answer
}