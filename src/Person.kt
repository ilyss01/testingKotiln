/*      if no arguments - you can just write "class nameOfTheClass() {...}"
otherwise, it's necessary to write "class nameOfTheClass *something* constructor() {...}"    */

/*                  1
class Person(_firstName: String, _lastName: String) {
    init { // runs everytime when the class is initialized
        println("The Person is initialized")
    }
    val firstName = _firstName
    val lastName = _lastName
}   firstName and lastName can be accessed by this but can't be printed by themselves:

val varName = Person(firstName, lastName)
val className = varName.firstName   */

/*                  2
class Person(val firstName: String = "Guest", val lastName: String = "Guest") {

    var nickName: String? = null
}
*/

/*                  3
class Person(val firstName: String = "Guest", val lastName: String = "Guest") {
    init {
        println("init 1")
    }

    constructor(): this("Peter", "Parker"){
        println("Secondary constructor") // will run in case when no parameters are given
    }

    init {
        println("init 2") // bad practice yet in works
    }
}
*/

// TODO: to comment and to understand the class(es?)
class Person(val firstName: String = "Guest", val lastName: String = "Guest") {
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }

        get() {
            println("The returned value is $field")
            return field
        }
}