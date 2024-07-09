object CaesarCipher{
    def cipher(x:String,Shift:Int):String={
        var num = 1
        var z= " "
        for(i <- x){
            val l = ((i - 'A' + Shift) % 26 + 26) % 26 + 'A'
            z = z + l.toChar
        }
        return z
    }
    def main(args:Array[String]):Unit={
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        println("The new String is ="+cipher(alphabet,5))
    }
}