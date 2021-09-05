fun main(){
    println(getRepeatedIntersection(intArrayOf(1,2,3,2,0), intArrayOf(5,1,2,7,3,2)))
    println(myFunc(listOf<Int>(1,2,3,2,0),listOf<Int>(5,1,2,7,3,2,3,2)))
}

fun myFunc(list1: List<Int>,list2: List<Int>):List<Int>{
    val l1 = list1.toList()
    val l2 = list2.toMutableList()
    val result = mutableListOf<Int>()

    l1.forEach {el1 ->
        if(l2.indexOf(el1) != -1) {
            result.add(el1)
            l2.removeAt(l2.indexOf(el1))
        }
    }

    return result.sorted()
}

fun getRepeatedIntersection(a1: IntArray,a2:IntArray):List<Int>{
    val s1 = a1.toHashSet()
    val s2 = a1.toHashSet()

    val result = mutableListOf<Int>()

    for(el in s1){
        if(s2.contains(el)){
            val numOfRepeats = minOf(a1.count{ it == el},a2.count{ it == el })
            repeat(numOfRepeats){ result.add(el) }
        }
    }

    return result
}


