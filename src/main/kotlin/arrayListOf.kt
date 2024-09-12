fun main(args: Array<String>) {
    //Array List (mutable) bisa diubah
    /*
    Method :
    clear(), contains(), size,get() or [], ad() or +=,remove() or -=,
    removeAt(), toTypedArray(), lastIndexOf(), removeAll(), reverse()
     */
    val arrayList = arrayListOf(1,2,3)
    print("Arraylist array : " )
    for (item in arrayList){
        print(item)
    }
    print("\n")
    arrayList += 9
    print("tambahkan 9 di arrayLIst : ")
    println(arrayList)

    arrayList.reverse()
    print("reverse array : ")

    arrayList -= 1 //we can delete!
    print("Remove last element in arraylist : ")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList : ")
    print(arrayList)
}