fun main() {
     val maruti = car("swift", "petrol" , 100)
    val tata =  car ("nexon" , "electric" , 200)
   println(maruti.name)
    println(maruti.type)

    println(tata.name)
    println(tata.type)

    tata.driveCar()
}

class car (val name : String , val type : String ,var kmRan:Int)
{
    fun driveCar(){
        println("$name Car is driving")
    }
    fun applyBreak(){
        println("Applied Breaks ")
    }
}