fun main(){
    var items = listOf("apple","banana","orange"); // неизменяемый список
    var items1 = mutableListOf("apple","banana","orange") //изменяемый список

    // for in
    for(item in items)
        println(item)

    // while
    var index = 0
    while(index < items.size){
        println("Item at $index is ${items[index]}")
        index++;
    }

    // диапазон
    println(5 in 3..10)

    for(i in 1..10)
        println(i)

    for(i in 1 until 10) // диапазон от 1 до 9
        println(i)

    for(i in 10 downTo 1) // проход от большего к меньшему
        println(i)

    for(i in 0..100 step 10) // проход от 0 до 100 с шагом 10
        println(i)
}