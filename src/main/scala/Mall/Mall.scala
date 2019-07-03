package Mall

import VendingMachine.VendingMachine
import mall.Price

case class Mall (machines: Seq[VendingMachine]){

  def registerMachine(vendingMachine: VendingMachine): Mall = {
    this.copy(machines = this.machines :+ vendingMachine)
  }

  def getAllProfits(): Price = {
    machines.map( m => m.profits).sum
  }
}
