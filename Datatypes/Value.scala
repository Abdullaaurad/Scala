object variables{
    def main(args: Array[String]): Unit={
        val Name = "Abdulla" // Type String inferred
        val Name2: String = "Fadhiya" 
        val Age = 20 // Type Int inferred
        val Age2: Int = 22
        val Wake = true // Type Boolean inferred
        val Wake2: Boolean = false
        val Height = 5.0000000003 // double type
        val kHeight = 5.0003f            //float type
        val Height2: Double = 5.00000000001
        val Height3: Float = 5.0
        println("I am "+Name+" and I am "+Age+" Years Old")
        println("Height in double ="+Height)
        println("Height in float ="+kHeight)
        println("I am "+Name2+" and I am "+Age2+" Years Old")
        println("Height in double ="+Height2)
        println("Height in float ="+Height3)
    }
}