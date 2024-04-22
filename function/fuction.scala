object Demo{
    def Add(x:Int , y:Int): Int = {
        x+y
    }
    def Subtract(x:Int , y:Int): Int =x-y
    def Multiply(x:Int , y:Int): Int = {
        return x*y
    }
    def divide(x:Int , y:Int) = x/y
    def main(args: Array[String]): Unit ={
        var x: Int =5
        var y: Int =3
        var l = Multiply(x,y)
        println(s"the value of $x*$y = $l")
        var k = Add(x,y)
        println(s"the value of $x+$y = $k")
        var m = Subtract(x,y)
        println(s"the value of $x-$y = $m")
        var n = divide(x,y)
        println(s"the value of $x/$y = $n")
    }
}