import scala.io.StdIn.readInt

object PrimeNumbercheck extends App {
//    println("Enter a number:")
//    val n = readInt()


    def isPrime(n:Int , i:Int = 2):Boolean = {
        n match {
            case x if x <= 1 => false
            case x if x == i => true
            case x if x%i==0 => false
            case _ => isPrime(n,i+1)
        }
    }

    println(isPrime(1))
    println(isPrime(2))
    println(isPrime(11))
    println(isPrime(29))
    println(isPrime(51))
    println(isPrime(10))

}
