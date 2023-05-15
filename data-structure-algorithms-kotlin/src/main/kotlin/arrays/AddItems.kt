package arrays

fun main() {
    val array = arrayOf("Java", "Kotlin", "Golang", "Rust", "C++")
    val newArray = addLinearPosition(array, "JavaScript", 1)

    println("Original: ${array.contentToString()}")
    println("New: ${newArray.contentToString()}")
}

fun addLinearPosition(arr:Array<String>, item:String, position:Int):Array<String>{

    if(position >= arr.size)
        throw ArrayIndexOutOfBoundsException("Position is bigger than arr size")

    val newArray = Array(arr.size + 1){r -> r.toString()}
    newArray[arr.size] = arr[arr.size - 1]

    var nextData:String? = null

    for ((currentIndex, current) in arr.withIndex()){
        if(currentIndex == position && nextData == null) {
            newArray[currentIndex] = item
            nextData = current
        }else{
            if (nextData != null) {
                newArray[currentIndex] = nextData
                nextData = current
                continue
            }

            newArray[currentIndex] = current
        }
    }

    return newArray
}