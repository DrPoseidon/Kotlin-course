fun main(){
    val a = listOf(1,2,3,4,5)

    a.forEach { e-> println(e) }
    println(a.map {e -> e*2})
    println(a.filter { e -> e %2  == 0  })
    println(a.reduce {sum,e -> sum + e})

    a.sorted()
    a.sortedDescending() // сортировка по убыванию
    println(a.any { it > 10 }) // есть ли хоть один элемент удовлетворяющий условию
    a.all{ it < 10 } // все элементы удовлетворяют условию
    a.sum()

    val numbers = listOf(1,3,-4,2,-11)
    val (positive,negative) = numbers.partition { it > 0 } // разделение списка на 2 коллекции

    println("Положительные $positive")
    println("Отрицательные $negative")

    val result = listOf("a","b","ba","ccc","ad").groupBy { it.length } // группировка списка по какому-либо признаку (по длине строки)
    println(result)
}