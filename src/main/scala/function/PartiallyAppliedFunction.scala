package function

import java.util.Date

object PartiallyAppliedFunction {
  def log(date: Date, message: String)  = {
    println(date.toString + "----" + message)
  }

  def printData():Unit = {
    val date = new Date
    val logWithDateBound = log(date, _ : String)

    logWithDateBound("message1" )

    logWithDateBound("message2" )
  }

}
