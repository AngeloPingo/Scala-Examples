package pt.angelopingo.examples.scala.basics

import java.io.FileNotFoundException

class ErrorHandling {

  def generateError(): Unit = {
    val filePathNotExists = "not_exists.txt"
    try {
      io.Source.fromFile(filePathNotExists).getLines()
    } catch  {
      case fileNotFoundException:FileNotFoundException => println("File " + filePathNotExists + " doesn't exist!\n" + fileNotFoundException.getMessage)
      case exception:Exception => println("Some error!\n" + exception)
    }
  }

}
