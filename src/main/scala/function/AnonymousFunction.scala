package function

object AnonymousFunction {



  def anonymousFunction():Unit = {
    var inc = (x:Int) => x+1
    var mul = (x: Int, y: Int) => x*y
    var str = () => { System.getProperty("user.dir") }
    println(inc(7)-1)
    println(mul(3, 4))
    println(str.apply())
  }

}
