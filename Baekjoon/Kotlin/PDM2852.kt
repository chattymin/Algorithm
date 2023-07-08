import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var N = readLine().toInt()

    var team1Total = 0
    var team1Now = 0
    var team1Score = 0
    var team2Total = 0
    var team2Now = 0
    var team2Score = 0

    repeat(N){
        val (team, time) = readLine().split(" ")

        when(team){
            "1" -> println("일단 이렇게")
            "2" -> println("일단 요렇게")
        }
        // 밑에 내용을 함수화해서 위에 넣자.
        if (team == "1"){
            if (team1Score == team2Score){ // 역전
                team1Now = time.slice(0..1).toInt()*60 + time.slice(3..4).toInt()
            }else if(team1Score+1 == team2Score){ // 동점
                team2Total += time.slice(0..1).toInt()*60 + time.slice(3..4).toInt() - team2Now
            }
            team1Score++

        }else{
            if (team1Score == team2Score){ // 역전
                team2Now = time.slice(0..1).toInt()*60 + time.slice(3..4).toInt()
            }else if(team1Score == team2Score+1){ // 동점
                team1Total += time.slice(0..1).toInt()*60 + time.slice(3..4).toInt() - team1Now
            }
            team2Score++
        }
    }

    if (team1Score > team2Score) team1Total += 48*60 - team1Now
    else if (team1Score < team2Score) team2Total += 48*60 - team2Now


    bw.write("${zeroPlus(team1Total/60)}:${zeroPlus(team1Total%60)}\n${zeroPlus(team2Total/60)}:${zeroPlus(team2Total%60)}")
    bw.flush()
    bw.close()
}

fun zeroPlus(num: Int): String = if (num < 10) "0$num" else num.toString()