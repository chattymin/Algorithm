class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val minPresses = mutableMapOf<Char, Int>()
        
        keymap.forEach { keys ->
            keys.forEachIndexed { index, char ->
                val pressCount = index + 1

                minPresses[char] = minOf(minPresses.getOrDefault(char, Int.MAX_VALUE), pressCount)
            }
        }
        
        val answer = IntArray(targets.size)
        
        targets.forEachIndexed { targetIdx, target ->
            var sum = 0
            var impossible = false
            
            for (char in target) {
                if (char !in minPresses) {
                    impossible = true
                    break
                }
                sum += minPresses[char]!!
            }
            
            answer[targetIdx] = if (impossible) -1 else sum
        }
        
        return answer
    }
}
