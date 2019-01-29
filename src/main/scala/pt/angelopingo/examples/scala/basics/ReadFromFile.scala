package pt.angelopingo.examples.scala.basics

import io.Source.fromFile
class ReadFromFile {

  def readForLoop(filename: String): Unit = {
    val filePath = getClass.getResource(filename).getPath.replaceAll("%20", " ")
    for (line <- fromFile(filePath).getLines()) {
      println(line)
    }
  }

  def readList(filename: String): Unit = {
    val filePath = getClass.getResource(filename).getPath.replaceAll("%20", " ")
    val listLines = fromFile(filePath).getLines().toList
    listLines.foreach(println)
  }

}
