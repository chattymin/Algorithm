package LV.`1`

fun main() {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        val resultMap: HashMap<String, Int> = hashMapOf()

        for ((index, value) in name.withIndex()) {
            resultMap[value] = yearning[index]
        }

        photo.forEach { pic ->
            var sum = 0

            pic.forEach { name ->
                sum += resultMap[name]?:0
            }

            answer = answer.plus(sum)
        }

        return answer
    }

    println(solution(arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3), arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni") )).toList())
}
