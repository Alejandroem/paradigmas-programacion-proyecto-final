import Cigars.{Puritos, PuritosStock, Rubios, RubiosStock}
import VendingMachine.VendingMachine

object Main {
  def main(args: Array[String]): Unit = {


    val stocks = Seq(RubiosStock, PuritosStock)
    val vendingMachine = new VendingMachine("Miraflores",stocks, 0.0)

    val refill1 = Seq(Rubios,Rubios)
    vendingMachine.refill("Rubios",refill1)
    val refill2 = Seq(Puritos,Puritos)
    vendingMachine.refill("Puritos",refill2)


    val pack =vendingMachine.getPack("Rubios")

    println(s"Pack price ${pack.price}")
    println(s"Vending profits ${vendingMachine.profits}")
  }
}
