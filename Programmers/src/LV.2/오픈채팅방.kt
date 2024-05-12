package LV.`2`


fun main() {
    fun solution(record: Array<String>): Array<String> {
        var answer = arrayOf<String>()
        var userIdSet = hashSetOf<String>()
        var userMap = mutableMapOf<String, String>()

        record.forEach { log ->
            var userLog = log.split(" ")
            if(userLog[0] == "Enter"){
                answer += answer.plus("${userLog[1]}님이 들어왔습니다.")
            }else{
                answer += answer.plus("${userLog[1]}님이 나갔습니다.")
            }

            if(userIdSet.contains(userLog[1])){
                userMap.
            }
        }

        return answer
    }

    println(solution(arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan").toList().toString())
}
