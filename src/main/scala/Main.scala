import function.DefaultValueParameter
import function.CallByName
import function.NestedFunction
import function.FunctionWithNamedArg
import function.PartiallyAppliedFunction
import function.AnonymousFunction
import function.CurryingFunction
import function.HigerOrderGenericFunction
import function.ClosureFunction
import collection.ArrayData
import collection.ListData
import collection.MapData

object Main {
  def main(args: Array[String]) = {
    println(msg)
    val ages = Seq(89,56,32,65)
    var name = "Othniel Muno"
    println(s"The oldest of all is ${ages.max}")
    println(s"His name is ${name}")
    /* Start Logic*/
    CallByName.delayed(CallByName.time())
    DefaultValueParameter.sum()
    NestedFunction.factorialPrint()
    FunctionWithNamedArg.printInt(b = 10, a = 5)
    PartiallyAppliedFunction.printData()
    AnonymousFunction.anonymousFunction()
    CurryingFunction.callCurryingFunction()
    HigerOrderGenericFunction.callHigerOrderGenericFunction()
    ClosureFunction.callClosureFunction()

    //Array and Collection
    ArrayData.callArrayData()
    ListData.listNew()
    MapData.calMap()
  }


}

def msg = "I was compiled by Scala 3. :)"
