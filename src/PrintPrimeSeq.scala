import PrimeNumbercheck.isPrime //reused of code from the previous question
import scala.io.StdIn.readInt

object PrintPrimeSeq extends App{
    println("Enter A number")
    val n = readInt()
    def printPrimeNumbers(n:Int):Unit = {

        if(n<=1){
            ()
        }
        else{
            printPrimeNumbers(n-1);
        }
        if (isPrime(n)){
            println(n)
        }


    }

    printPrimeNumbers(n)
}
