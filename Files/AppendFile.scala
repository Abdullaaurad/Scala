import scala.tools.nsc.io.File

object AppendToFile {
  def main(args: Array[String]): Unit = {
    val fileName = "./Files/Append.txt"
    val contentToAppend = "This is appended text.\n"

    try {
      // Append content to the file
      val file = File(fileName)
      file.appendAll(contentToAppend)
      println(s"Successfully appended text to '$fileName'")
    } catch {
      case e: Exception => println(s"Error appending to file: ${e.getMessage}")
    }
  }
}