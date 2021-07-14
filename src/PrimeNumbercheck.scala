
object PrimeNumbercheck extends App {


    def isPrime(n:Int , i:Int = 2):Boolean = {
        n match {
            case x if x <= 1 => false
            case x if x == i => true
            case x if x%i==0 => false
            case _ => isPrime(n,i+1)
        }
    }



}
