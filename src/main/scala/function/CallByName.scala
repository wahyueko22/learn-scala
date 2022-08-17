package function

object CallByName {
  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }

  //time function will be executed inside the method
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }

  //time function will be excuted first and the velue will be parse to delayedLongParam method
  def delayedLongParam( t: Long ) = {
    println("In delayedLongParam method")
    println("Param: " + t)
  }
}
