object Pattern{
    def Pattern(x:Int):Unit={
        if(x!=0){
            for(i <- 1 to x){
                print(i)
            }
            println("")
            Pattern(x-1)
        }
    }
    
    def Reversed(x:Int):Unit={
        if(x!=0){
            Reversed(x-1)
            for(i <- 1 to x){
                print(i)
            }
            println("")
        }
    }
    def main(args: Array[String]):Unit={
        println("Correct Pattern")
        Pattern(4)
        println("Reversed Pattern")
        Reversed(5)
    }
}