object triangle {
    def pattern(x: Int): Unit = {
        if(x>=1){
            pattern(x-1);
            var i=1;
            while(i<=x){
                print(i);
                i=i+1
            }
            println("");
        }
    }

    def main(args: Array[String]): Unit = {
        pattern(4)
    }
}
