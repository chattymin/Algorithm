package LV.`0`

fun main() {
    println(solution(arrayOf(".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."), 2).toList())
}

fun solution(picture: Array<String>, k: Int): Array<String> {
    var result = arrayOf<String>()

    for (i in picture){
        var temp = ""
        for (j in 0 until i.length){
            repeat(k){
                temp += i[j]
            }
        }
        result = result.plus(temp)
        result = result.plus(temp)
    }

    return result
}