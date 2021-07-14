import Q4_EvenOrOddCheck.checkEven

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q5_EvenAddition extends App {

    println("Enter a number")
    val n = readInt()

    @tailrec
    def addEven(n:Int, sum:Int = 0): Int ={
        if (n == 0) sum
        else if (checkEven(n)) addEven(n-2 , sum + n-2) //tail recursion
        else addEven(n-1 , sum + n-1) //tail recursion

    }

    println( addEven(n) )

}
