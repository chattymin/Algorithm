import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val nums = readLine().split(" ").map { it.toBigInteger()}
    println(nums[0] + nums[1])
}