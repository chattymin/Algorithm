import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()
    val nums = readLine().split(" ").map { it.toInt() }
    val v = readLine().toInt()

    println(nums.count { it == v })
}