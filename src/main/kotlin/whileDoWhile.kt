fun main(args: Array<String>) {
    //while loop
    var x : Int = 0
    println("Example of While loop--")
    while (x<=10){
        print("$x ")
        x++
    }
    print('\n')
    //do-while loop
    var y : Int = 0
    do {
        y = y+10
        println("i am inside the block -- " +y)
    } while (y<=50)

}