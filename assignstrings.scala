object assignstring{
    def main(args: Array[String]): Unit={
        val x =20;
        var str = "";
        if(x==20){
            str = "x is equal to 20" ;
        }
        else if(x<20){
            str = "x is les than 20" ;
        }
        else{
            str = "x is greater than 20";
        }
        println(str);
    }
}