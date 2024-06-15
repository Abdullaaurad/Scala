object anonymous_function{
    val evenOrOdd = (a:Int)=> a % 2 match {
        case 0 => println("Even")
        case _ => println("Odd")
    }
    var IsOdd = (i:Int) => i%2 ==1;
    def main(args: Array[String]):Unit ={
        println (IsOdd(5));   
        evenOrOdd(2);    
    }
}