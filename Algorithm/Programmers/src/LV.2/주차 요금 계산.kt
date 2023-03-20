import javax.swing.KeyStroke

fun main() {
    println(solution(intArrayOf(180, 5000, 10, 600), arrayOf("05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT")).toList().toString())
}

fun solution(fees: IntArray, records: Array<String>): IntArray {
    var answer: MutableMap<String, Int> = mutableMapOf()

    // fees : 기본시간, 기본요금, 단위시간, 단위요금
    // => defaultFee + (총 소요시간 - defaultTime)올림 * unitFee
    val defaultTime = fees[0]
    val defaultFee = fees[1]
    val unitTime = fees[2]
    val unitFee = fees[3]

    var carRecord: Array<Car> = arrayOf()
    var calcRecord: Array<Calc> = arrayOf()

    for (i in records){
        val temp = i.split(" ")
        carRecord = carRecord.plus(
            Car(
                temp[0].slice(0..1).toInt(), // hour
                temp[0].slice(3..4).toInt(), // minute
                temp[1],
                temp[2]
            ))
    }

    // 시간 계산
    for (i in 0 until carRecord.size){
        //println("시간 ${carRecord[i].hour}:${carRecord[i].minute}     차량번호 ${carRecord[i].carNum}     내역 ${carRecord[i].state}")
        if (carRecord[i].state == "IN"){
            var temp = carRecord.slice(i until carRecord.size).find { it.state == "OUT" && it.carNum == carRecord[i].carNum }
            val time = (((temp?.hour?:23) - (carRecord[i].hour)) * 60) + ((temp?.minute?:59) - (carRecord[i].minute))
            calcRecord = calcRecord.plus(Calc(carRecord[i].carNum, time))
        }
    }

    //차량번호로 정렬
    calcRecord.sortBy { it.carNum }

    // 요금 계산
    for (i in calcRecord){
        var temp = calcRecord.filter { it.carNum == i.carNum }.sumOf { it.time }

        var usingTime = (temp - defaultTime) / unitTime.toDouble()

        if (usingTime <= 0){
            answer.put(i.carNum, defaultFee)
            continue
        }

        if (usingTime%1 >0) usingTime = usingTime/10 * 10 + 1

        var result = defaultFee + usingTime.toInt() * unitFee

        answer.put(i.carNum, result)

    }

    return answer.values.toIntArray()
}

class Car(val hour: Int, val minute: Int, val carNum: String, val state: String)

class Calc(val carNum: String, val time: Int)