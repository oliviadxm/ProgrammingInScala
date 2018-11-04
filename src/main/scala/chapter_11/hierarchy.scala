package chapter_11

object hierarchy {

  def divide(x: Int, y: Int): Int =
    if (y != 0) x / y
    else error("can't divided by zero")

  class Dollars(var amount: Int) extends AnyVal {
    override def toString() = "$" + amount
  }

  class SwissFrancs(val amount: Int) extends AnyVal {
    override def toString() = amount + "CHF"
  }

  val dollars = new Dollars(1000)
  println(dollars)

  val francs = new SwissFrancs(1000)
  println(francs)

}
