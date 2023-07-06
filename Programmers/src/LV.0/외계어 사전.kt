package LV.`0`

fun main() {
    println(solution(arrayOf("p","o","s"), arrayOf("sod", "eocd", "qixm", "adio", "soo")))
}

//fun solution(spell: Array<String>, dic: Array<String>) = if(dic.map { it.toList().sorted().joinToString { "" } }.contains(spell.sortedArray().joinToString { "" })) 1 else 2
// 정렬한 후 정렬곳에 spell이 정렬된게 존재하는지 확인

fun solution(spell: Array<String>, dic: Array<String>): Int {
    for (i in dic){
        var cnt = 0
        for(j in spell) {
            if (i.contains(j)) cnt++
            if (cnt == spell.size) return 1
        }
    }
    return 2
}