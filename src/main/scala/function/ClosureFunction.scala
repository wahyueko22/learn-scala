package function

object ClosureFunction {
  val multiplier  = (i:Int) => i * 10
  var factor : Int = 3
  val multiplierTwo = (i:Int) => i * factor
  def callClosureFunction(): Unit =  {
    println(multiplier(1))
    println(multiplierTwo(2))
  }
}
