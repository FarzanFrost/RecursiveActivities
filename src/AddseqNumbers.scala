import scala.io.StdIn.readInt

object AddseqNumbers extends App {

    def addAll(n:Int , sum:Int = 0): Int ={
        if (n==1) sum + 1
        else{
            addAll(n-1, sum+n)
        }
    }

    println("Enter a number")
    println(addAll(readInt()))

}
