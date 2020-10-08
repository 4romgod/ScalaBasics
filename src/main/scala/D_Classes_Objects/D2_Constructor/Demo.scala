package D_Classes_Objects.D2_Constructor

object Demo {
  def main(args:Array[String]): Unit = {
    val json = new Person("Jason", "Momosa")
    println(json.fName)
    println(json.lName)
    println(json.getName)
  }

}
