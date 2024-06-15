import java.io._

object WriteToFile {
  def main(args: Array[String]): Unit = {
    println("Enter a string to write to a file:")
    val userInput = scala.io.StdIn.readLine()
    val fileName = "./Files/write.txt"
    val writer = new PrintWriter(new File(fileName))

    try {
    writer.println(userInput)
    println(s"Successfully wrote '$userInput' to '$fileName'")
    } catch {
    case e: Exception => println(s"Error writing to file: ${e.getMessage}")
    } finally {
    writer.close()
    }
  }
}