class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

fun printArea(rectangle: Rectangle): Int {
    var rect = rectangle.width * rectangle.height
    return rect
}

fun main() {
    val rectlangle = Rectangle()
    rectlangle.width = 5
    rectlangle.height = 3
    println(printArea(rectlangle))
}