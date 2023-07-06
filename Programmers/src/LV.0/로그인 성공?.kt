package LV.`0`

fun main() {
    println(solution(arrayOf("meosseugi", "1234"), arrayOf(arrayOf("rardss", "123"), arrayOf("yyoom", "1234"), arrayOf("meosseugi", "1234"))))
}

fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
    val id = id_pw[0]
    val pw = id_pw[1]
    var correctId = false

    db.forEach {
        if(id == it.get(0)){
            if (pw == it.get(1))
                return "login"
            correctId = true
        }
    }
    return if (correctId) "wrong pw" else "fail"
}