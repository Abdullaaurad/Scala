object multi{
    def addNumbers(Numbers:Int*)={
        var total=0;
        for(number<-Numbers) total+=number;
        total
    }

    def main(args: Array[String]):Unit= {
        println (addNumbers(2));
        println (addNumbers(3,6));
        println (addNumbers(1,3,5,7,9));
    }
}