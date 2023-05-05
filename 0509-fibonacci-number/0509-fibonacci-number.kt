class Solution {
    fun fib(n: Int): Int {
        if (n < 2) return n
        
        var first = 0
        var second = 1
        var next = 0
        
        for(i in 2 .. n){
            next = first + second
            first = second
            second = next
        }
        
        return second
    }
}