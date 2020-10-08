package A_Syntax

object A7_For_Loops {

  def main(args: Array[String]): Unit = {
    loopTo()
    loopUntil()
    multipleRange()
    loopCollection()
    loopWithFilter()
  }


  def loopTo(): Unit = {
    println("LOOP TO")
    // 0 to 5 (5 is inclusive)
    for (num <- 0 to 5) {
      print(num + ", ")
    }
    println()
    println("----------------------------------\n")
  }


  def loopUntil(): Unit = {
    println("LOOP UNTIL")
    // 0 to 5 (5 is exclusive)
    for (num <- 0 until 5) {
      print(num + ", ")
    }
    println()
    println("----------------------------------\n")
  }


  def multipleRange(): Unit ={
    println("MULTIPLE RANGE")
    for(w <- 0 to 3; z<- 8 until 10){
      println("W: " + w + ", " + "Z: " + z)
      println("============")
    }
    println("----------------------------------\n")
  }


  def loopCollection(): Unit ={
    println("LOOP THROUGH COLLECTION")
    val aList = List(5,3,7,4,6,8,9,2,1)

    for(item <- aList){
      print(item + ", ")
    }
    println()
    println("----------------------------------\n")
  }


  def loopWithFilter(): Unit ={
    println("LOOP WITH FILTERS")
    val aList = List(5,3,7,6,4,8,9,2,1)

    /// print every item in list, that is greater than 5, but less than 9
    for(item <- aList if item>=5; if item <9) {
      print(item + ", ")
    }
    println()
    println("----------------------------------\n")
  }


}
