object Now{
    def main(args: Array[String]): Unit ={
        val sum = (a: Int, b: Int, c: Int)=> a+b+c
        val f = sum(10,20,_: Int)
        println(f(3))
    }
}