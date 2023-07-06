class Solution {
    fun tribonacci(n: Int): Int {
        if(n < 3){
            when(n){
                0 -> return 0
                1 -> return 1
                2 -> return 1
            }
        }
        
        var first = 0
        var second = 1
        var third = 1
        var temp = 0
        
        for(i in 3 .. n){
            temp = first + second + third
            first = second
            second = third
            third = temp
        }
        
        return third
    }
}