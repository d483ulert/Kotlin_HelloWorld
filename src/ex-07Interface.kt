package src

fun main(){
    
    val dog = Dog1()
    val cat = Cat1()
    
    if(dog is Dog1){
        print("멍멍이")
    }

    //강제 타입 캐스팅
    cat as Dog1
}

interface Drawable {
    fun draw(){

    }
    
}
//상속을 허용하려면 open을 붙여야함.
abstract class Animal1{
    open fun move(){
        print("이동")
    }
}
open class Dog1 : Animal(), Drawable{
    override fun move(){
        print("껑충")
    }
}

class Cat1 : Animal()

