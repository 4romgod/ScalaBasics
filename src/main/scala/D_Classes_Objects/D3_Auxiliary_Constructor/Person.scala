package D_Classes_Objects.D3_Auxiliary_Constructor

class Person {
  private var firstName = ""
  private var lastName = ""

  // Auxiliary constructor 1
  def this(fName:String){
    this()  // call primary constructor
    this.firstName = fName
  }

  // Auxiliary constructor 2
  def this(fName:String, lName:String){
    this(fName)   // call auxiliary constructor 1
    this.lastName = lName
  }

  def getFullName:String = {
    val fullName = this.firstName + ' ' + this.lastName
    fullName
  }

}
