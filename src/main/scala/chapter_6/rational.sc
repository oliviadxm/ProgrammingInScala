package chapter_6

object rational {
  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)
  println(oneHalf + twoThirds)

  val y = new Rational(3)
  println(y)

  // Rational in normalized form
  val x = new Rational(66, 42)
  println(x)

  val a = new Rational(1, 2)
  val b = new Rational(2, 3)
  println(a + b)
  println(a + a * b)

  println(x * x)
  println(x * 14)

  implicit def intToRational(x: Int) = new Rational(x)
  //> intToRational: (x: Int)chap06.Rational
  println(2 * twoThirds)
}

