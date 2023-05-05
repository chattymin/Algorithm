import kotlin.math.min
class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val len = cost.size
        var first = cost[0]
        var sec  = cost[1]
        var temp = 0

        for (i in 2 until len){
            temp = min(first + cost[i], sec + cost[i])
            first = sec
            sec = temp
        }

        return min(first, sec)
    }
}