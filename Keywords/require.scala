object req{
    def some(x:Int):Unit ={
        require(x>0, "must be positive")
    }
    def main(args: Array[String]):Unit = {
        some(5)
        //some(-2)   gives error
    }
}