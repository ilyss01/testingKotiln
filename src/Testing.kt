/*                var1 is that the function is getting
fun nameOfTheFun (var1: VarType): VarType
                                  VarType is that fun will return. If the fun is just printing - can be skipped */
fun printHello() {
    println("Hello world")
}

fun printHelloWorld() = println("Hello world")

fun helloForEach (greeting: String, itemsToGreet: Array <String>) {
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun sayHello(greeting: String, vararg itemsToGreet: String){
    // vararg accepts anything with String type. If itemsToGreet are not got by the function - it will not be executed
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")
// default greeting argument is "Hello" so it may be not specified

fun main() {
    var name: String = "Ilya"
    val surname = "Romanuk"
    /*
    var/val nameOfTheVar: VarType = value

    var - MUTABLE variable
    val - IMMUTABLE variable

    Types of variables:
    * Bool 0 1
    * Byte -128 : 127
    * Short -32 768 : 32 767
    * Int -2 147 483 648 : 2 147 483 647
    * Long –9 223 372 036 854 775 808 : 9 223 372 036 854 775 807
    * Float -3.4*10^38 : 3.4*10^38
    * Char abc...xyz
    * String anything

    Adding "?" at the end of the VarType makes variable available being null         */

    printHello()
    printHelloWorld()

    println(name + "\n$surname")
    /*                $var prints variable
    \t - tabulation
    \n - new line
    \' - single quotation mark
    \" - double quotation mark
    \\ - backslash                         */

    val greeting = if (name == "Ilya") "Hello Ilya" else "Hello stranger"
    //             if (statement) command1 else command2

    when (greeting) {
        //statement -> command
        "Hello Ilya" -> println("Hello $name $surname")
        "Hello stranger" -> println("Greetings Stranger")
        else -> println("Who are you?")
    }
    // when thing can be done with variables: var a = when(b){...}

    // it's ARRAY, not list. Only one type of data allowed. Also, less memory consumed
    val interestingThings = arrayOf("Programming", "Android", "Linux things", "Dr Pepper")
    // by default arrays/lists are immutable, to make them mutable it should be "mutableArrayOf"
    println(interestingThings.size) // returns size of the array
    println(interestingThings[0])   // prints out first element of the array, negative indexes are not working

    for (i in interestingThings) {
        // iterable variable shouldn't be initialized
        println(i)
    }
    // or
    interestingThings.forEach { i ->
        /*
        it can be without "i" so it would be
        interestingThings.forEach {
            println(it)
        }
         */
        println(i)
    }

    // or

    interestingThings.forEachIndexed { index, interestingThing ->
        // you know index of the value
        println("$interestingThing is at index $index")
    }

    val awesomeThings = mutableListOf("Winter", "Music") // list of things
    awesomeThings.add("Playing guitar") // adds things to the list
    awesomeThings.forEach { i -> println(i) }

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c") // basically dictionary in python
    map.forEach { key, value -> println("$key -> $value") } // can be separated to 3 lines like in block in line 73
    map.put(4, "d") // add pair to the map

    helloForEach("Greetings", interestingThings)

    sayHello("Hi", "Anon", "Ilya", "user")
    sayHello("Hi") // wouldn't work because no itemsToGreet
    sayHello("hi", *interestingThings) // if no "*" - the program will crush

    greetPerson(greeting = "Greetings", name = "traveler") // good practice is to specify what parameters you are giving to the function
    greetPerson(name = "traveler", greeting = "Greetings")
    greetPerson(name = "Ilya")
    greetPerson() // Hello Kotlin by default

    sayHello(itemsToGreet = *interestingThings, greeting = "Hi") // EVERY parameter must have been specified

    println("")
    println("============Classes============")
    println("")

    // CLASSES

    val person = Person()
    person.firstName
    person.lastName
    person.nickName = "ilyss01"
    person.nickName = "modless_flash"
    print(person.nickName)
}
