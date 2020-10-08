package D_Classes_Objects.D4_Case_Class

object Demo {
  def main(args:Array[String]): Unit ={
    val pirate = new Person("Jack", "Sparrow")
    val pirate2 = new Person("Jack", "Sparrow")
    val pirate3 = pirate.copy(lastName = "Sparrow3")

    println(pirate.firstName + ' ' + pirate.lastName)
    println(pirate.toString)
    println("pirate == pirate2 is " + pirate == pirate2)
    println(pirate3.toString)

  }

}
