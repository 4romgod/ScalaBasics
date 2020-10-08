package A_Syntax

object A2_Variable_Types {

  def main(args:Array[String]): Unit = {
    vars()
    vals()
  }

  // var(mutable)
  def vars(): Unit = {
    var num1 = 5
    println("num1 = " + num1)

    // change the value
    num1 = 120
    println("num1 = " + num1)
  }


  // val(immutable)
  def vals():Unit = {
    val num1 = 20
    println("num1 = " + num1)

    // attempt to change the value, throws an error
    //num1 = 255
    println("num1 = " + num1)
  }

}
