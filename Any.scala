object Any{
    def main(args: Array[String]):Unit={
        val mixedList: List[Any] = List(1, "hello", 3.14, true)
        //val marks: List[Int] = List(20,34.1,99.999999)

        for (element <- mixedList) {
            element match {
                case i: Int => println(s"Integer: $i")
                case s: String => println(s"String: $s")
                case d: Double => println(s"Double: $d")
                case b: Boolean => println(s"Boolean: $b")
                case _ => println("Unknown type")
            }
        }
    }
}