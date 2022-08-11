object Main {
  def main(args: Array[String]) = {
    println(msg)
    val ages = Seq(89,56,32,65)
    var name = "Othniel Muno"
    println(s"The oldest of all is ${ages.max}")
    println(s"His name is ${name}")
    delayed(time())
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }

  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }
}

def msg = "I was compiled by Scala 3. :)"
