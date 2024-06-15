object reduce {
    def main(args: Array[String]):Unit ={
        val l = List(2, 5, 3, 6, 4, 7)
        println (l.reduce((x, y) => y max x))
        println (l.reduce((x,y)=>x min y))
    }
}