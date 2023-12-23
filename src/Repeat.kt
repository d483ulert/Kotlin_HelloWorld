package src

fun main(){
    val items = listOf(1,2,3,4,5,6,7)
    for(item in items){
        println(item)
    }

    items.forEach { item ->
        println(item)
    }

    //for(int i=0; i< items.size; i++)
    for(t in 0..items.size -1 ){
        println(items[t])
    }

}