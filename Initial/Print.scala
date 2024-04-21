object Howtoprint {
  // Main method, entry point of the program
  def main(args: Array[String]): Unit = {
    // Print "Hello, World!" to the console
    println("Hello, World!")
    val Name = "Abdulla" // Type String inferred
    val Age = 22 // Type Int inferred
    val Wake = true // Type Boolean inferred
    val Height = 5.0000000003 // double type
    val kHeight = 5.0003f            //float type
    println("I am "+Name+"and I am "+Age+" Years Old")
    println(s"I am $Name and \tI am $Age Years Old")
    println("Are you awake now ="+Wake)
    println("Height in double ="+Height)
    println("Height in float ="+kHeight)
    printf("I am %s and \tI am %d Years Old\n",Name,Age)
    println(f"I am $Name%s and my height $Height%f")        //doesn't support %lf
    print("In same line")
    print("will be printed")
  }
}