package arrays

fun main() {
    val array = arrayOf("Java", "Kotlin", "Golang", "Rust", "C++")
    val newArray = addLinearPosition(array, "JavaScript", 0)

    println("Original: ${array.contentToString()}")
    println("New: ${newArray.contentToString()}")
}

fun addLinearPosition(arr: Array<String>, item: String, position: Int): Array<String> {
    require(position >= 0 && position <= arr.size) { "Position is out of bounds" }

    val newArray = Array(arr.size + 1) { "" }
    var newIndex = 0

    for ((currentIndex, current) in arr.withIndex()) {
        if (currentIndex == position) {
            newArray[newIndex++] = item
        }
        newArray[newIndex++] = current
    }

    if (position == arr.size) {
        newArray[newIndex] = item
    }

    return newArray
}