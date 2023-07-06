import java.util.*

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean = (getStack(s) == getStack(t))

    fun getStack(str: String): Stack<Char>{
        val st: Stack<Char> = Stack() 
        for(i in 0 until str.length){
            if(str[i] == '#'){
                if(!st.isEmpty())
                    st.pop()
            }else
                st.push(str[i])
        }
        return st
    }
}