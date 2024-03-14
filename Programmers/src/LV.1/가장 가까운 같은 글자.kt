package LV.`1`

fun main() {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val alphabetSet: MutableSet<Pair<Char, Int>> = hashSetOf()
        // Map으로 key value로 저장
        // key는 알파벳, value는 index.
        // 해당 key가 존재한다면 내 Index - index, 없다면 -1

        s.mapIndexed { index, value->
            val beforeValue = alphabetSet.find { it.first == value }

            if (beforeValue != null) {
                answer += index - beforeValue.second
                alphabetSet.remove(beforeValue)
                alphabetSet.add(Pair(value, index))
            } else {
                answer += -1
                alphabetSet.add(Pair(value, index))
            }
        }

        return answer
    }

    println(solution("banana").toList())
}