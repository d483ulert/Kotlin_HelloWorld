package src

fun main(){

}
//상속을 허용하려면 open을 붙여야함.
abstract class Animal{
    open fun move(){
        print("이동")
    }
}
open class Dog : Animal(){
    override fun move(){
        print("껑충")
    }
}

class Cat : Animal()

