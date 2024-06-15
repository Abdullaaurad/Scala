object Trait{
    trait Greeter {
        def greet(name: String): String
    }
    trait Friendly {
        def beFriendly(): String = "I'm always friendly!"
    }

    class PoliteGreeter extends Greeter with Friendly {
        def greet(name: String): String = s"Good day, $name!"
    }

    def main(args: Array[String]):Unit= {
        val x = new PoliteGreeter
        x.greet("Abdulla")

        //val y = new Friendly
        //y.beFriendly()            //! can't access it because it is a trait
    }
}

//?Traits: A class can extend multiple traits. This allows for a form of multiple inheritance
//Cannot have constructor parameters.
//Can have fields, but fields in traits are not initialized until they are used in a concrete class.