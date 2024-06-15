object more{
    def main(args: Array[String]):Unit= {
        val sum=(x:Int,y:Int)=>x+y
        val mul=(x:Int,y:Int)=>x*y
        val cal=(f1:(Int,Int)=>Int,f2:(Int,Int)=>Int,x:Int,y:Int)=>(f1(x,y),f2(x,y))
        print (cal(sum,mul,23,45))
    }
}