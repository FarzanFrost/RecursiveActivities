import scala.io.StdIn.readInt


object fibonacciNumbers extends App {

    println("Enter a number")
    val n = readInt()

    def printFibonacci( n:Int , x:Int = 0 , y:Int = 1):Unit = {

        println(x)
        if (n==1)()
        else printFibonacci(n-1 , y , x+y) //tail recursion

    }

    printFibonacci(n)

}
