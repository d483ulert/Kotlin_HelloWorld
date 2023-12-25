package src

fun main(){
    myFunc({
        print("하하하ㅏ")
    })
}

fun myFunc(callBack: () -> Unit){
    callBack();
}