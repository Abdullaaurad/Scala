object Test {
    def main(args: Array[String]):Unit= {
        delayed(time());
    }
    def time():Long = {
        println("Getting time in nano seconds")
        System.nanoTime
    }
    def delayed(t:Long) = {
        println("In delayed method")
        println("Param: " + t)
    }
}