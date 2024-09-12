fun main(args: Array<String>) {
    // set <T> stores unique elements; their order is generally undefined.
    val numbers = setOf(1,2,3,4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equal : ${numbers == numbersBackwards}")
    //the default implementation of set - LinkedHashSet - preserves the order of elements insertion
    println(numbers.first()== numbersBackwards.first())
    println(numbers.last()== numbersBackwards.last())

    val strings = hashSetOf("a","b","c","c") //hash set value unik
     println("My Set are "+strings)
}