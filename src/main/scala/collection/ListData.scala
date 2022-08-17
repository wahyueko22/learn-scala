package collection
import scala.collection.mutable.ListBuffer

object ListData {
  def listNew(): Unit = {
    //functional programming style in list
    val p1 : List[String] = List("jong")
    val p2 = "Julia" :: p1
    val p3 = "Judi" :: p2
    println(p3)

    //mutable list
    var fruits = new ListBuffer[String]()
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Orange"
    val fruitsList = fruits.toList
    println(fruitsList)
  }
}
