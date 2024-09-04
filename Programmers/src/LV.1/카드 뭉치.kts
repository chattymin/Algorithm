class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var cards1Size = cards1.size
        var cards2Size = cards2.size
        var cards1Index = 0
        var cards2Index = 0

        for (target in goal) {
            if (cards1Index < cards1Size && cards1[cards1Index] == target) {
                cards1Index++
            } else if (cards2Index < cards2Size && cards2[cards2Index] == target) {
                cards2Index++
            } else {
                return "No"
            }
        }

        return "Yes"
    }
}
