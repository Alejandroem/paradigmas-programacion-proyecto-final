package Cigars

sealed trait PackStock {
  val name: String
  var stock: Seq[Pack]
  val limit: Int

  def getFirst(): Pack ={
    stock = stock.tail
    stock.head
  }

  def refill(newStock:Seq[Pack]){
    stock = stock ++ newStock
  }

}

case object RubiosStock extends PackStock {
  val name = "Rubios"
  var stock: Seq[Pack] = Seq()
  val limit = 30
}

case object PuritosStock extends PackStock {
  val name = "Puritos"
  var stock: Seq[Pack] = Seq()
  val limit = 100
}

