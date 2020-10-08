package C_Collections.C2_List

object C2_1_Create {

  def main(args:Array[String]): Unit ={
    normalList()
    consList()
    matrix()
    fillMatrix()
  }

  def normalList() {
    // List with elements of type String
    println("NORMAL LIST")
    var fruits: List[String] = List("Apples", "Banana", "Pears", "Pineapple")
    fruits = "Peach" :: fruits

    println(fruits)
    println("-------------------------------------------\n")
  }


  def consList(): Unit = {
    println("CONS LIST")
    var fruits = "Apples" :: ("Banana" :: ("Pears" :: ("Pineapple" :: Nil)))
    fruits = "Peach" :: fruits

    println(fruits)
    println("------------------------------------------\n")
  }


  def matrix(): Unit = {
    // Two dimensional List
    println("MATRIX LIST")
    val matrix: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    println(matrix)
    println("------------------------------------------\n")
  }


  def fillMatrix(): Unit = {
    println("AUTO FILL LIST")
    val matrix = List.fill(3)(List(math.random(), math.random(), math.random()))

    println(matrix)
    println("------------------------------------------\n")
  }



}
