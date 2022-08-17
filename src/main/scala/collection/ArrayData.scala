package collection

object ArrayData {
    def callArrayData() :Unit = {
      var z:Array[String] = new Array[String](3)
      var myList = Array(1.9, 2.9, 3.4, 3.5)

      // Print all the array elements
      for ( x <- myList ) {
        println( x )
      }
    }
}
