package C_Collections.C2_List

object C1_Lists extends App {

  listOperations()




  def listOperations(): Unit ={
    println("LIST OPERATIONS")
    val fruits = "Apples" :: ("Banana" :: ("Pears" :: ("Pineapple" :: Nil)))

    println(fruits)
    println("Head: " + fruits.head)   // the first element of the list
    println("Tail: " + fruits.tail)   // all elements after head
    println("isEmpty: " + fruits.isEmpty)
    println("------------------------------------------\n")
  }


}
