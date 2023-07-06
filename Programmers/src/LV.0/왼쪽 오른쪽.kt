package LV.`0`

fun main() {
    println(solution3(arrayOf("r","l")).toList())
}

fun solution3(str_list: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf<String>()

    val lIndex = str_list.indexOf("l")
    var rIndex = str_list.indexOf("r")

    if (rIndex == -1 && lIndex != -1 && lIndex != 0){ // r 안나오고 l나옴 -> l 왼쪽 반환
        answer = str_list.sliceArray(0 until lIndex)
    }else if (rIndex != -1 && lIndex == -1 && rIndex != str_list.lastIndex){ // l 안나오고 r 나옴 -> r 오른쪽 반환
        answer = str_list.sliceArray(rIndex + 1 until str_list.size)
    }else if (rIndex != -1 && rIndex != -1 && rIndex != str_list.lastIndex && lIndex != 0) { // 둘다 나옴 -> 둘중 인덱스가 더 작은걸로 처리
        if (lIndex < rIndex) answer = str_list.sliceArray(0 until lIndex)
        else answer = str_list.sliceArray(rIndex + 1 until str_list.size)
    }
    // 둘다 안나오거나, l이 0이거나, r이 size -1이면 비어있는 arr 반환

    return answer
}

/*
1. ---- l ----- r ----- -> 0 until lIndes
2. l ---- r ---- -> []
3. ---- l ---- -> 0 until lIndes
4. l ---- -> []

1, 3 : l의 index가 0이 아니고, r보다 먼저 나옴 -> r이 안나와도 됨
2, 4 : l의 index가 0, r의 인덱스는 상관없음. clear

1. ---- r ----- l ----- -> rIndex + 1 until size
3. ---- r ---- -> rIndex + 1 until size
4. ----- r -> []

1, 3 : r의 index가 size-1이 아니고, l보다 먼저 나옴 -> l은 0이 될 수 없음
4 : r의 index가 size -1이고 l은 안나옴 -> l은 0이 될 수 없음

 */