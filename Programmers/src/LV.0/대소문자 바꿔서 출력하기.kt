package LV.`0`

fun main(args: Array<String>) {
    val s1 = readLine()!!
    s1.map {
        if (it.isUpperCase()) print(it.lowercase())  else print(it.uppercase())
    }
}