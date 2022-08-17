package function

object CurryingFunction {
  def strcat(s1: String)(s2: String) : String = { s1 + s2 }

  def strcatTwo(s1: String) = (s2: String) => s1 + s2

  def callCurryingFunction(): Unit = {
    println(strcat("foo")("bar"))
    println(strcatTwo("foo")("bar"))
  }
}


