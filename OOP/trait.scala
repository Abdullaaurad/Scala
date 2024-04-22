object Trait{
    def main(args: Array[String]): Unit ={
        //val An = new Animal()
        val dog = new Dog()
        println(dog.sound()) // Output: Woof!
    }

    trait Animal {
        def sound(): String
    }

    class Dog extends Animal {
        def sound(): String = "Woof!"
    }
}