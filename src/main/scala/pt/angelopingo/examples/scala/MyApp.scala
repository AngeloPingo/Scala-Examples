package pt.angelopingo.examples.scala

import pt.angelopingo.examples.scala.basics.{ErrorHandling, ReadFromConsole, ReadFromFile, Sets}

object MyApp {

  def main(args: Array[String]): Unit = {
    val option = printAndSetOption
    chooseAndRunExample(option)
  }

  private def printAndSetOption = {
    print(
      "Want do you want?\n" +
        "1 - Read from console example.\n" +
        "2 - Read from file example.\n" +
        "3 - Error handling example.\n" +
        "4 - Sets example.\n"
    )
    val option = readInt()
    option
  }

  private def chooseAndRunExample(option: Int): Unit = {
    option match {
      case 1 =>
        val readFromConsole = new ReadFromConsole()
        readFromConsole.readStudentGrade()
      case 2 =>
        val readFromFile = new ReadFromFile()
        val filename = "/example-file.txt"
        readFromFile.readForLoop(filename)
      case 3 =>
        val errorHandling = new ErrorHandling()
        errorHandling.generateError()
      case 4 =>
        val sets = new Sets()
        sets.example()
      case whoa => println("Invalid option: " + whoa.toString)
    }
  }

}
