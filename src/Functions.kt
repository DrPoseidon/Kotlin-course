fun main(){
//    println(testInteger(3, 10));
//    println(testString((10)))
//
//    println(testNamedArguments(y = 4,z = 2,x = 5))
//
//    testDefaultArguments()
//    testDefaultArguments(y = 1)
//    testDefaultArguments(x = 2,y = 1)

//    printEven(1,2,3,4,5,6,7,8)
    printEven(*intArrayOf(1,2,3,4,5),6,7,8,9,10)
}

fun testInteger(x: Int, y: Int) = x + y

fun testString(x: Int):String {
    return "String is $x"
}

fun testNamedArguments(x:Int, y: Int, z:Int):List<Int>{
    return listOf(x,y,z)
}

// функция ничего не возвращает, тип ее ну нужно указывать
fun testDefaultArguments(x:Int = 1,y:Int = 2){
    println(x+y)
}

// vararg
fun printEven(vararg  numbers:Int){
    numbers.forEach { e -> if(e % 2 == 0) println(e) }
}