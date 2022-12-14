package arrays

fun main() {
    val array = arrayOf("Java", "Kotlin", "Golang", "Rust", "C++")
    val newArray = removeItemFromArray(array, 2)

    println("Original: ${array.contentToString()}")
    println("New: ${newArray.contentToString()}")
}

private fun removeItemFromArray(oldArray:Array<String>, indexToRemove:Int):Array<String>{
    if(indexToRemove >= oldArray.size || indexToRemove < 0)
       throw ArrayIndexOutOfBoundsException("Index invalid....")

    val newArray = Array(oldArray.size - 1){r -> r.toString()}

    var next = false
    for ((currentIndex, current) in oldArray.withIndex()){
        if(currentIndex >= newArray.size) break
        if(currentIndex == indexToRemove) next = true

        newArray[currentIndex] = if(next) oldArray[currentIndex+1] else current
    }

    return newArray
}