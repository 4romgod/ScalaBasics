package A_Syntax

object A6_Conditional_Expressions {

  def main(args:Array[String]): Unit = {
    val age = 20
    val status = if(age >= 21) "You are an Adult" else "Still a small boy"
    val diet = if(age <= 20) "Dyana mukapu" else "Dyana vuswa na nyama"

    println(status)
    println(diet)
  }

}
