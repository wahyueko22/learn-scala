package function

object HigerOrderGenericFunction {
  def apply(f: Int => String, v: Int) = f(v)
// T is generic
  def layout[T](x: T) = "[" + x.toString() + "]"

  def callHigerOrderGenericFunction():Unit = {
    println( apply( layout, 10) )
  }
}
