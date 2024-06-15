object fold{
    def main(args: Array[String]): Unit={
        val l = List(5,2,9,3)
        val k=l.fold(0)((x, y) => x + y)
        print (k);
    }
}