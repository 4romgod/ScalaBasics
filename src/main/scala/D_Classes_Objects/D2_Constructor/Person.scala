package D_Classes_Objects.D2_Constructor

class Person(firstName: String, lastName:String) {
  val fName = firstName
  val lName = lastName

  def getName = {
    val fullName = fName + ' ' + lName
    fullName
  }

}
