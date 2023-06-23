package LV.`0`

fun main() {
    println(solution2("abc1abc1abc"))
}

fun solution2(code: String): String {
    var answer: String = ""
    var mode = true // mode == 0

    for (i in 0 until code.length){
        if (mode){
            if (code[i] == '1') mode != mode
            else{
                if (i % 2 == 0) answer += code[i]
            }
        }else{
            if (code[i] == '1') mode != mode
            else{
                if (i % 2 == 1) answer += code[i]
            }
        }
    }

    return if (answer != "") answer else "EMPTY"
}