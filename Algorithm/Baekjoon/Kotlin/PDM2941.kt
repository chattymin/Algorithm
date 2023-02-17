import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val input = readLine()
    var cnt = 0
    var result = 0

    val croatianAlphabets = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    while (cnt < input.length){
        val str = input.substring(cnt)

        for (alpahbet in croatianAlphabets) {
            if (str.startsWith(alpahbet)) {
                cnt += alpahbet.length-1
                break
            }
        }
        result++
        cnt++
    }
    println(result)
}