package Cigars

import mall.Price

sealed trait Pack { val price: Price}

case object Rubios extends Pack  { val price: Price = 1.50 }
case object Puritos extends Pack { val price: Price = 0.90 }
