class Solution {
    private val alphabetMap = ('a'..'z').withIndex().associateBy({ it.value }, { it.index })
    
    fun solution(s: String, skip: String, index: Int): String {
        val skipSet = skip.toSet()
        val validChars = ('a'..'z').filter { it !in skipSet }.toList()
        val validSize = validChars.size
        
        return s.map { c ->
            val currentIndex = validChars.indexOf(c)
            val newIndex = (currentIndex + index) % validSize

            validChars[newIndex]
        }.joinToString("")
    }
}
