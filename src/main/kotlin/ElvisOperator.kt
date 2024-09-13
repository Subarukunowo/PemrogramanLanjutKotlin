fun main(args: Array<String>) {
    //elvis operator ?:
    var maybeWelcome : String = "Hello World"
    println(maybeWelcome?.length ?: 0)
}