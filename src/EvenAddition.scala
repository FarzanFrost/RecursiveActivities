import EvenOrOddCheck.checkEven
import scala.io.StdIn.readInt

object EvenAddition extends App {

    println("Enter a number")
    val n = readInt()

    def addEven(n:Int , sum:Int = 0): Int ={
        if (n == 0) sum
        else if (checkEven(n)) addEven(n-2 , sum + n-2)
        else addEven(n-1 , sum + n-1)

    }

    println( addEven(n) )

}
