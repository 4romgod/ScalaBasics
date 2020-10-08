package C_Collections.C4_Map

object C3_1_Create {

  def main(args:Array[String]): Unit ={
    initValues()
  }


  def initValues(): Unit = {
    val fighters = Map(1->"Floyd", 2->"Lomachenko", 3->"Spence", 4->"Crawford")
    println(fighters)
    println("\nfighters.head == " + fighters.head)
    println("\nfighters.tail == " + fighters.tail)
    println("\nfighters.keys == " + fighters.keys)
    println("\nfighters.values == " + fighters.values)
    println("\nfighters.isEmpty == " + fighters.isEmpty)
    println("\nfighters.contains(5) == " + fighters.contains(5))

  }


}
