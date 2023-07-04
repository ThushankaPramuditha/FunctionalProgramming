object interestfunc {
  def calculateInterest(depositAmount: Double): Double = {
    val flatInterest1 = 0.02
    val flatInterest2 = 0.04
    val flatInterest3 = 0.035
    val flatInterest4 = 0.065

    depositAmount match {
      case amount if amount <= 20000 => depositAmount * flatInterest1
      case amount if amount <= 200000 => depositAmount * flatInterest2
      case amount if amount <= 2000000 => depositAmount * flatInterest3
      case amount => depositAmount * flatInterest4
    }
  }

  def main(args: Array[String]): Unit = {
    val depositAmount: Double = 50000
    val interestAmount: Double = calculateInterest(depositAmount)
    println(s"The interest earned on Rs. $depositAmount is Rs. $interestAmount")
  }
}



