package C_Collections.C3_Set

object C2_Sets  extends App{

  println("ORIGINAL SETS")
  val set1 = Set(11, 13, 15, 20, 10)
  val set2 = Set(10, 7, 8, 19, 10)
  println("set1 == " + set1)
  println("set2 == " + set2)
  println("-------------------------------\n")

  println("INTERSECTION OF SETS")
  println(set1 +" intersect " + set2 + " == " + (set1 intersect set2))
  println(set2 +".intersect(" + set1 + ") == " + set2.intersect(set1))

  println("\nUNION OF SETS")
  println(set1 +" union " + set2 + " == " + (set1 union set2))
  println(set2 +".union(" + set1 + ") == " + set2.union(set1))

  println("-------------------------------\n")


}
