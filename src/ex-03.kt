package src

fun main(){
    val name: String? = null
    //코틀린에서 null을 대입시키려면 타입뒤에 ? 를 붙여야함.

    var name2: String = ""

    // null이 아닐경우.  if(name != null) null 과 같음)
    name?.let{
        name2 = name
    }


}
