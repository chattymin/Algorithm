import kotlin.math.max

class Solution {
    fun rob(nums: IntArray): Int {
        val len = nums.size
        if (len < 4){
            when(len){
                1 -> return nums[0]
                2 -> return max(nums[0], nums[1])
                3 -> return max(nums[0]+nums[2], nums[1])
            }
        }
        
        var fir = nums[0]
        var sec = nums[1]
        var third = fir + nums[2]
        var next = 0

        for(i in 3 until len){
            next = max(fir, sec) + nums[i]
            fir = sec
            sec = third
            third = next
        }

        return max(sec, third)
    }
}