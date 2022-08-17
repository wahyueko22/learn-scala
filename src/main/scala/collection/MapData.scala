package collection

object MapData {
  def calMap(): Unit = {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
  }
}
