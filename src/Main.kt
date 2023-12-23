import java.util.*
import kotlin.math.max
import kotlin.random.Random

fun main() {
    var name = "hello"
    println(name.uppercase())
    println(name[0])
    println("오늘 아침인사는 ${name} 이죠 ")

    mng()

    random();

    sc();
}

fun sc() {
    val reader = Scanner(System.`in`)
    reader.nextInt()
    reader.next()
}

fun mng() {

    var i = 10
    var j = 20
    print(max(i,j))
}

fun random(){
    val randomNumber = Random.nextInt(0,100);
    println(randomNumber)
}

