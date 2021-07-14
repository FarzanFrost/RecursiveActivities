object EvenOrOddCheck extends App {

    def checkEvenOdd(n:Int): Boolean ={

        if (n == 0)true
        else if (n==1)false
        else checkEvenOdd(n%2)
    }
    
}
