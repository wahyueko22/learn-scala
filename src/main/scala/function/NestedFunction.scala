package function

object NestedFunction {
  def factorial(i: Int): Int = {
    def fact(i: Int): Int = {
      if (i <= 1)
        1
      else
        i * fact(i - 1)
    }
    fact(i)
  }

  def factorialPrint(): Unit = {
    println(factorial(4))
  }
}
