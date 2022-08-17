package function

object DefaultValueParameter {
  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  def sum() : Unit = {
    println(addInt(2,5))
    println(addInt())
  }
}
