fun main(args: Array<String>) {
    //Array methods
    //sort()
    val simpsonsA = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA){
        print(simpson + ' ')
    }
    print('\n')
    //sorted
    val simpsonsB : Array<String> = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    val simpson_sorted = simpsonsB.sortedArray()
    for (simpson in simpson_sorted){

        print(simpson + ' ')
    }
    print('\n')

    //reverse() and reversedArray()
    val simpsonC : Array<String> = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    simpsonC.sort()
    simpsonC.reverse()
    for (simpson in simpsonC){
        print(simpson + " ")

    }
    print('\n')

    //indexOf
    val simpsonsD = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    val simpson = ("Lisa")
    val position = simpsonsD.indexOf(simpson)
    if (position != -1){
        println("Yeah,thats my number ${position + 1} Simpson!  ")
    } else {
        println("Hey thats not a Simpson!")
    }
    val simpsonsE = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    println("simpsons size : " +simpsonsE.size)
    if (!simpsonsE.isEmpty())
    println("Array tidak kosong!")
    println("Min = " +simpsonsE.min())
    println("Max = " +simpsonsE.max())
    println("First = " +simpsonsE.first())
    println("Last = " +simpsonsE.last())
    println(simpsonsE.contains("Marge"))

}