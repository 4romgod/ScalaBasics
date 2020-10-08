package A_Syntax

object A3_Data_Types {

  def main(args:Array[String]):Unit = {
    println()

    strings()
    int()
    doubles(50.5, 2.5)
    boolean()
    character()
    unit()
  }

  // String
  def strings(){
    val text: String = "This is a string"
    println(text)
    println(text.getClass())
    println("======================\n")
  }

  // Int
  def int(): Unit = {
    val numb1: Int = 25
    val numb2: Int = 30
    val sum = numb1 + numb2
    println(numb1 + " + " + numb2 + " = " + sum)
    println(sum.getClass())
    println("======================\n")
  }

  // Double
  def doubles(num1:Double, num2:Double): Unit = {
    val sum = num1 + num2
    println(sum)
    println(sum.getClass())
    println("======================\n")
  }

  // Boolean
  def boolean(): Unit = {
    val bool: Boolean = false
    println(bool)
    println(!bool)
    println(bool.getClass())
    println("======================\n")
  }

  // Char
  def character(): Unit = {
    val charac: Char = 'Z'
    println(charac)
    println(charac.getClass())
    println("======================\n")
  }

  // Unit
  def unit(): Unit = {
    val unit: Unit = Unit
    println(unit)
    println(unit.getClass())
    println("======================\n")
  }

  // Tuples



}
