fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)

    repeat(n){
        for (i in 0..it){
            print("*")
        }
        println()
    }
}