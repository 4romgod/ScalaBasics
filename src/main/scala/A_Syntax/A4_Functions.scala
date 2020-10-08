package A_Syntax

object A4_Functions extends App{

  printSomething("5^2 = " + double(5))

  def printSomething(text:String): Unit = {
    println(text)
  }

  def double(num:Int):Int = {
    val answer = num*num
    return answer
  }


}
