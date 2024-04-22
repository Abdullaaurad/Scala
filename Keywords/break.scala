import scala.util.control.Breaks._

object bre{
    def main(args: Array[String]): Unit ={
        for (i <- 1 to 10) {
            if (i == 5) {
                break() // Exit the loop
            }
            println(i)
        }
    }
}