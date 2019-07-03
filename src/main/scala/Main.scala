import Cigars.{Puritos, PuritosStock, Rubios, RubiosStock}
import City.City
import Mall.Mall
import VendingMachine.VendingMachine

object Main {
  def main(args: Array[String]): Unit = {


    val stocks = Seq(RubiosStock, PuritosStock)
    val vendingMachine = new VendingMachine("Okland Mall",stocks, 0.0)

    val refill1 = Seq(Rubios,Rubios)
    vendingMachine.refill("Rubios",refill1)
    val refill2 = Seq(Puritos,Puritos)
    vendingMachine.refill("Puritos",refill2)


    val vendingMachine2 = new VendingMachine("Okland Mall",stocks, 0.0)
    vendingMachine2.refill("Rubios",refill1)
    vendingMachine2.refill("Puritos",refill2)

    var mall = new Mall(Seq(vendingMachine))
    mall = mall.registerMachine(vendingMachine2)

    val vendingMachine3 = new VendingMachine("Las trinitarias",stocks, 0.0)
    vendingMachine3.refill("Rubios",refill1)
    vendingMachine3.refill("Puritos",refill2)

    var mall2 = new Mall(Seq(vendingMachine3))

    val pack =vendingMachine.getPack("Rubios")
    val pack2 =vendingMachine2.getPack("Rubios")


    var city = City(Map())

    city = city.addMallToCity("Guatemala", mall)
    city = city.addMallToCity("Barquisimeto<3", mall2)

    println(s"Pack price ${pack.price}")
    println(s"Vending profits ${vendingMachine.profits}")
    println(s"Mall profits ${mall.getAllProfits()}")
    println(s"City profits ${city.getProfitsFromCity("Guatemala")}")

  }
}
