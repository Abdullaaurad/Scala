object collatz{
    def display(n:Int):Unit={
        var k:Int=n
        while(k>1){
            if (k%2 == 0){
                k=k/2
                print(s"$k ")
            }
            else{
                k=(3*k)+1
                print(s"$k ")
            }
        }
    }

    def main(args: Array[String]):Unit = {
        display(21)
    }
}