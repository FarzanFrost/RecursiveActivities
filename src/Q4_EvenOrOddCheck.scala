import scala.annotation.tailrec

object Q4_EvenOrOddCheck extends App {

    @tailrec
    def checkEven(n:Int): Boolean ={

        if (n == 0)true
        else if (n==1)false
        else checkEven(n%2) //tail recursion
    }


}
