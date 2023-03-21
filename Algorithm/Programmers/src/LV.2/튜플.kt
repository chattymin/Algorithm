package LV.`2`

fun main() {
    println(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}").toList().toString())
}

fun solution(s: String): IntArray {
    var answer = intArrayOf()
    val tuple = s.split("},") // 튜플 분리
    var temp: Array<String> = arrayOf()


    for (i in tuple){ // 괄호 제거
        var str = i.replace("{", "").replace("}","")
        temp = temp.plus(str)
    }

    temp.sortBy { it.length } // 튜플의 갯수가 적은것부터 정렬

    for (i in temp){ // ,를 제거한 후 내부 숫자가 answer에 존재하지 않는다면 추가.
        for (j in i.split(",")){
            if (!answer.contains(j.toInt()))
                answer = answer.plus(j.toInt())
        }
    }

    return answer
}