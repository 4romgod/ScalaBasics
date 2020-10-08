package A_Syntax

object A5_Lambda_Functions {

  def main(args:Array[String]): Unit = {
    println("5^3 = " + power(5, 3) )
    println(add(5)(10))
  }

  val power = (base:Int, exp:Int) => {
    val answer = scala.math.pow(base, exp)
    answer
  }

  val add = (a:Int) => (b:Int) => {a + b}    // closure, since returned function uses val a

}
