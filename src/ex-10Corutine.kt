package src

fun main(){

}

//suspend 정지함수 이함수 끝날때까지 대기 코루틴스코프로 실행가능
suspend fun myFunc2(callBack: () -> Unit){
    println("10")
    callBack();
    println("20")
}