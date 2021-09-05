fun main(){
    val child = Person("Child","Child",1)
    val p1 = Person("Tom","Jones",35,child)
    println(p1)

    val rectangle1 = Rectangle(5.0,2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0,2.0)
    println(rectangle1 == rectangle2 )
}

// первичный конструктор (Primary Constructor)
class Person(val firstName:String,val lastName:String,var age:Int){
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init{
        println("Person is created $firstName")
    }

    // вторичный конструктор
    constructor(firstName: String,lastName: String,age: Int, child:Person):
            this(firstName,lastName,age){
                children.add(child)
    }

    // конструктор без аргументов
    constructor(): this("","",-1)
}

data class Rectangle(var height:Double,var length:Double){
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // field = this.поле
        set(value){
            if(value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}