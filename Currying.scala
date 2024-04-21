object Curr{
    def Add (x: Int) = (y: Int) => x+y
    def main(args: Array[String]): Unit ={
        println(Add(12)(5))

        val n = Add(2)
        println(n(3))
    }
}