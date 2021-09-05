fun main(){
    var a:String = "Hello"
    println(a.length)

    var b: String? = "Test"
    b = null
    // b.length - нельзя вызвать
    println(b?.length) // безопасный вызов

    // Elvis оператор
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "asdf" else null
    // !! - выбрасывает NPE, в случае если в переменной null
    val t = b!!.length
}
