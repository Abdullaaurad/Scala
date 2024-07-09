object reduce{

    def CalMax(x:Int,y:Int):Int={
        if(x>y){
            return x
        }
        else{
            return y
        }
    }

    def main(args:Array[String]):Unit={
        var l = Array(1,2,3,4,5,6,7,8,9)

        val k = l.reduce(CalMax)
        print("The Array =")
        for (i <- l){
            print(i+" ")
        }
        println("")
        println("the max value ="+k)
    }
}