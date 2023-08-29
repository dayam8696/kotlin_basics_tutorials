// default constructor && lateinit

fun main() {
    val ob = calculator()
println(ob.add(2,4))
}

class calculator {
    lateinit var message :String
    fun add(a: Int, b: Int): Int {
        return a + b
    }


    fun multiply(a: Int, b: Int): Int {
        return a * b
    }


}