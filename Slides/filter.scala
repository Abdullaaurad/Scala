object fil{
    def main(args: Array[String]):Unit = {
        val list1 = List(1,4,9,2,5,7);
        val Even=(x:Int)=>x%2==0
        val list2=list1.filter(Even)
        for (num <- list2){
            println (num)
        }
    }
}