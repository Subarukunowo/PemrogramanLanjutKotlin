fun main(args: Array<String>) {
    //Nullable types
    var maybeNumber : Int? = 15
    maybeNumber = null
    println("maybe number : $maybeNumber ${maybeNumber?.hashCode()}")
}