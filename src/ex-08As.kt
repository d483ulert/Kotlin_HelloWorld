package src

fun main(){
    val box = Box(10)
    val box2 = Box("ddddf")

    print(box.value)
}

class Box<T>(var value: T){

}