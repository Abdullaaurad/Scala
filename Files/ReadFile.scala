import scala.io.Source

object ReadFile {
  def main(args: Array[String]): Unit = {
    val fileName = "./Files/Read.txt"

    try {
      val fileContent = Source.fromFile(fileName).mkString
      for (line <- Source.fromFile(fileName).getLines()) {
        println(line)
      }
      println(s"Successfully read file: $fileName")
    } catch {
      case e: Exception => println(s"Error reading file: ${e.getMessage}")
    }
    val source = scala.io.Source.fromFile("./Files/Read.txt","UTF-8").getLines
    val words=source.flatMap(line=>line.split(" "))
    words.foreach(word => print(word + " "))
  }
}