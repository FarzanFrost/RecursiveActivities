object EvenOrOddCheck extends App {

    def checkEven(n:Int): Boolean ={

        if (n == 0)true
        else if (n==1)false
        else checkEven(n%2)
    }

    println( checkEven(4))
    println( checkEven(5))


}
