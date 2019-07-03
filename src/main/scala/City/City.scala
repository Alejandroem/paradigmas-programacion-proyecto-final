package City

import Mall.Mall
import VendingMachine.VendingMachine
import mall.Price

case class City(malls:Map[String,Seq[Mall]]) {

  def addMallToCity(city:String, mall: Mall): City = {
    val cityMalls:Seq[Mall] =  malls.getOrElse(city,Seq())
    val newMallList = cityMalls :+ mall
    this.copy(malls = this.malls + (city -> newMallList ) )
  }

  def getProfitsFromCity(city:String): Price = {
    val cityMalls:Seq[Mall] =  malls.getOrElse(city,Seq())
    cityMalls.map(mall => mall.getAllProfits()).sum
  }

  def getMachineByUUID(UUID: String): VendingMachine={
    var machine:VendingMachine = null
    for ( ( city, malls ) <- malls) malls.find( mall => {
        machine = mall.getMachineByUUID(UUID)
        machine!=null
      }
    )
    machine
  }
}
