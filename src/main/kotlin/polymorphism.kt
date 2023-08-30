fun main() {
val circle :shape = Circle(4.0)
    val Square : shape = square(4.0)
    println(circle.area())
    println(Square.area())
}

open class shape {
   open fun area() : Double{
        return 0.0
    }
}

class Circle(val radius:Double):shape(){
   override fun area ():Double{
        return Math.PI * radius * radius
    }
}

class square (val side:Double):shape(){
  override  fun area ():Double{
        return  side * side
    }
}