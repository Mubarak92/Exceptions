

// this code will try and check if number is Int or not
// so the code will see if number is Int
// if it's it will print 10
// else will print 0
// in this case it's Double, so it will return 0

fun main() {
    val str = number("10.5")
    println(str)
}
fun number (str:String):Int{
    return try{
        Integer.parseInt(str)
    }
    catch(e:NumberFormatException){
        0
    }

}