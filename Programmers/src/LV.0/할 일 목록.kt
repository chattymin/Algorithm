package LV.`0`

fun main() {
    println(solution(arrayOf("problemsolving", "practiceguitar", "swim", "studygraph"), booleanArrayOf(true, false, true, false)))
}

//fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> = todo_list.filter { !finished[todo_list.indexOf(it)] }.toTypedArray()
fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> = todo_list.filterIndexed{index, str -> !finished[index] }.toTypedArray()