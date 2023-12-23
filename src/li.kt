package src

fun main(){
//    val items : MutableList<Int> = mutableListOf(1,2,3,4,5)
    val items = mutableListOf(1,2,3,4,5)

    items.add(6)
    items.remove(3)


    val array = arrayOf(1,2,3)  //배열은 잘안씀 배열대신 리스트를 씀
    array.size
    array[0] = 10


    try {
        val i = array[4]
    }catch (e: Exception){
        println(e.message)
    }
}

