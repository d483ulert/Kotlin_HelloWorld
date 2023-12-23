fun main(){
    var i = 1010
    if(i > 10){
        println("10 보다 크다")
    }else if(i > 5){
        println("5보다 크다");
    }else{
        println("쟤 좀 이상해");
    }
    println("")
    wn();

    println("");

    rn()
}

fun rn(){
    var i = 10
    var result = if (i > 10) {
        "10보다 크다"
    } else {
        "아니다"
    }

    println(result)
}

fun wn (){
    var i = 50
    when {
        i > 10 -> {
            println("10보다 크다");
        }
    }
}