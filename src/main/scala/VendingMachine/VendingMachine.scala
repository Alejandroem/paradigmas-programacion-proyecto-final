package VendingMachine

import Cigars.{Pack, PackStock}
import mall.Price

case class VendingMachine ( mall: String, var packStocks: Seq[PackStock], var profits: Price , UUID: String) {

  def getPack(cigarreteType: String): Pack = {
    var pack:Pack = null
    packStocks.foreach( packStock => {
      if(packStock.name == cigarreteType){
        pack = packStock.getFirst()
        profits = profits + pack.price
      }
    })
    pack
  }

  def refill(cigarreteType: String, packs: Seq[Pack]) {
    packStocks.foreach( packStock => {
      if(packStock.name == cigarreteType){
        packStock.refill(packs)
      }
    })
  }

}
