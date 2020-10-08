package D_Classes_Objects.D1_Person

class Person {
  val firstName = "Ebenezer"
  val lastName = "Mathebula"

  def getFullName: String = {
    val fullName = firstName + ' ' + lastName
    fullName
  }

}
