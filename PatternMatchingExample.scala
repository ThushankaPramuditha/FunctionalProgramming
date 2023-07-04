object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = scala.io.StdIn.readLine().toInt

    val result = input match {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(result)
  }
}

