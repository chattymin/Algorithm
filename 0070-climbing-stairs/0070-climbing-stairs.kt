class Solution {
    fun climbStairs(n: Int): Int {
        if(n < 4) return n
        
        var fir = 2
        var sec = 3
        var temp = 5
        
        for(i in 4 .. n) {
            temp = fir + sec
            fir = sec
            sec = temp
        }
        
        return temp
    }
}