def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1, 2)

def curriedSum(x: Int)(y: Int) = x + y
curriedSum(1)(2)

def first(x: Int) = (y: Int) => x + y
val second = first(1)

second(2)

val onePlus = curriedSum(1)_
onePlus(2)

val twoPlus = curriedSum(2)_
twoPlus(2)

def twice(op: Double => Double, x: Double) = op(op(x))

twice(_ + 1, 5)

val g = "Hello, world!"
g.substring(7, 9)

var assertionsEnabled = true
def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError()

myAssert(() => 5 > 3)

def byNameAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate)
    throw new AssertionError()
assertionsEnabled = false
val x = 5
byNameAssert(x / 0 == 0)