package src

fun main(){
    var Jhon = Person("김지성",24)
    var jhon2 = Person("김지성",24)

}

//data 라고 적으면 toString, Hashcode 등 기본입력
data class Person (
    //getter,setter를 val 과 var로 조절가능.
    //var는 setter,  val은 수정이 안되므로 no setter
    // getter 안되게 하려면 private
    val name: String,
    var age: Int
){
    var hobby = "취미"
        private set //외부에서 수정불가
        get() = "취미: $field"
    
    init{
        print("init")
    }
    fun some(){
        hobby = "농구"
    }
}