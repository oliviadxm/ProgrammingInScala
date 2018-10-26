package chapter_9

import java.io.{File, PrintWriter}

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles()

//  def filesEnding(query: String) =
//    for (file <- filesHere; if file.getName.endsWith(query))
//      yield file
//
//  def filesContaining(query: String) =
//    for (file <- filesHere; if file.getName.contains(query))
//      yield file
//
//  def filesRegex(query: String) =
//    for (file <- filesHere; if file.getName.matches(query))
//      yield file

  def filesMatching(query: String, matcher: (String, String) => Boolean) =
    for (file <- filesHere; if matcher(file.getName, query))
      yield file

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter(
    new File("date.txt"),
    writer => writer.println(new java.util.Date)
  )
}
