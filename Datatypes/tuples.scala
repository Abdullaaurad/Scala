object tupp{
    def main(args: Array[String]): Unit ={
        val mytuple = (1,2,"Hello",true)
        println(mytuple)
        println(mytuple._1)
        println(mytuple._3)
        
        val tuple = (1, "Scala")
        val swapped = tuple.swap
        println(swapped) 

        val tupleString = mytuple.toString()
        println(tupleString) // Output: (1,Scala,3.14)

    }
}