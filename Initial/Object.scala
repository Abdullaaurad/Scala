//the object keyword is used to define a singleton object. 
//A singleton object is an instance of a class that is unique we typically use object when defining main classes 
//we don't want multiple instance of main function

object HelloWorld {                              //Object works just like static 
  // Main method, entry point of the program
  def main(args: Array[String]): Unit = {
    // Print "Hello, World!" to the console
    println("Hello, World!")
  }
}