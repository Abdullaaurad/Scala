object Cost{
    def TotalCost(N:Int):Double={
        var Total:Double=0
        if(N<50){
            Total = 3*N
        }
        else{
            Total = 3*50
            Total = Total + 0.75*(N-50)
        }
        Total = Total + N*24.95
        return Total
    }
    def main(args: Array[String]):Unit={
        println ("Total cost ="+TotalCost(60))
    }
}