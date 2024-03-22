package LV.`1`

fun main() {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val year = today.slice(0..3).toInt()
        val month = today.slice(5..6).toInt()
        val day = today.slice(8..9).toInt()

        privacies.forEachIndexed{index, it ->
            val privaciesType = it[it.length - 1]

            var privaciesYear = it.slice(0..3).toInt()
            var privaciesMonth = it.slice(5..6).toInt()
            var privaciesDay = it.slice(8..9).toInt()

            if(privaciesDay - 1 == 0) {
                privaciesDay = 28
                if (privaciesMonth - 1 == 0){
                    privaciesMonth = 12
                    privaciesYear = privaciesYear - 1
                }else {
                    privaciesMonth = privaciesMonth - 1
                }
            }else {
                privaciesDay -= 1
            }


            terms.forEach{
                val type = it[0]

                if (privaciesType != type){
                    return@forEach
                }

                val term = it.slice(2 until it.length).toInt()

                // term은 최대 100까지 가능하다.
                privaciesYear += term/12
                privaciesMonth += term%12

                if (privaciesMonth > 12) {
                    privaciesYear += 1
                    privaciesMonth = privaciesMonth - 12
                }


                if (privaciesYear < year){
                    answer += index + 1
                    return@forEach
                }else if(privaciesYear > year){
                    return@forEach
                }

                if (privaciesMonth < month){
                    answer += index + 1
                    return@forEach
                }else if(privaciesMonth > month){
                    return@forEach
                }

                if (privaciesDay < day){
                    answer += index + 1
                    return@forEach
                }else if(privaciesDay > day){
                    return@forEach
                }

            }

        }

        return answer
    }

    println(solution("2022.05.19", arrayOf("A 6", "B 12", "C 3"), arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")).toList())
}
