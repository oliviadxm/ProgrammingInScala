import java.io.File

var filename = "default.txt"
if (!args.isEmpty)
  filename = args(0)

val filename1 =
  if (!args.isEmpty) args(0)
  else "default.txt"

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while (line != "")

def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)

for (i <- 1 to 4)
  println("Iteration " + i)

for (i <- 1 until 4)
  println("Iteration " + i)

val filesHere = (new File(".")).listFiles()
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for (
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(file + ": " + line.trim)
grep(".*gcd.*")

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException => // handle missing file
  case ex: IOException => // handle other I/O error
}

val firstArg = if (!args.isEmpty) args(0) else ""
val friend =
  firstArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
println(friend)

var i = 0
var foundIt = false

while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}

import scala.util.control.Breaks._
import java.io._

val in = new BufferedReader(new InputStreamReader(System.in))
breakable {
  while (true) {
    println("? ")
    if (in.readLine() == "") break
  }
}

def printMultiTable() = {
  var i = 1
  while (i <= 10) {
    var j = 1
    while (j <= 10) {
      val prod = (i * j).toString
      var k = prod.length
      while (k < 4) {
        println(" ")
        k += 1
      }
      print(prod)
      j += 1
    }
    println()
    i += 1
  }
}

def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

def makeRow(row: Int) = makeRowSeq(row).mkString()

def multiTable() = {
  val tableSeq =
    for (row <- 1 to 10)
      yield makeRow(row)
  tableSeq.mkString("\n")
}