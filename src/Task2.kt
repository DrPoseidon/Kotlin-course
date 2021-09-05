fun main(){
    val str: String = "AAAABBBECCCEEEEDDDBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"

    println(myFunc(str))
}

fun myFunc(str: String):String{
    var num: Int = 0
    var letter: Char = str[0]
    var result: String = ""
    str.forEachIndexed { idx,el ->

        if(idx == str.length - 1){
            result += "$letter${num+1}"
        }
        if(el == letter){
            num++
        }
        else{
            result += "$letter$num "
            letter = el
            num = 1
        }
    }

    return result
}