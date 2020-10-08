package C_Collections.C1_Array

object C0_Arrays extends App {

  create()
  read()

  def create(): Unit = {
    println("\nCREATE")

    val list1: Array[Int] = Array(5,2,8,7,3)
    println("Array(5,2,8,7,3) == " + list1.mkString(", "))

    val list2: Array[String] = Array.fill(5)("Str")
    print("Array.fill(5)(\"Str\") == ")
    list2.map(item => print(item + ", "))

    println()
    println("========================================\n")
  }


  def read(): Unit = {
    println("READ")
    val list1: Array[Int] = Array(5,2,8,7,3)

    list1.map(item => print(item + ", "))
    println()

    println("list1(2) == " + list1(2))
    println("========================================\n")
  }


  def update(): Unit = {
    println("UPDATE")
    println("========================================\n")
  }


  def delete(): Unit = {
    println("DELETE")
    println("========================================\n")
  }


}
