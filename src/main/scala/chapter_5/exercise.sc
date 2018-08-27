val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe

val dec1 = 31
val dec2 = 255
val dec3 = 20

val prog = 0XCAFEBABEL
val tower = 35L
val of = 311

val little: Short = 367
val littler: Byte = 38

val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123E45

val little2 = 1.2345F
val littlerBigger = 3e5f

val anotherDouble = 3e5
val yetAnother = 3e5D

val a = "A"
val d = '\u0041'
val f = '\u0044'

//val B\u0041\u0044 = 1

val backslash = '\\'

val hello = "hello"
val escapes = "\\\"\'"
println(
  """Welcome to Ultamix 3000.
    |Type "HELP" for help.
  """.stripMargin)

def updateRecordByName(r: Symbol, value: Any) = {
}

updateRecordByName('favoriteAlbum, "OK Computer")

val s = 'aSymbol
val nm = s.name

val bool = true
val fool = false

val name = "reader"
println(s"Hello, $name!")

s"The answer is ${6 + 7}."

f"${math.Pi}%.5f"