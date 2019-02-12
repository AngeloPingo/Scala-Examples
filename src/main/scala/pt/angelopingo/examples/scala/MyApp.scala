package pt.angelopingo.examples.scala

import pt.angelopingo.examples.scala.basics._

object MyApp {

  def main(args: Array[String]): Unit = {
    val exampleSelected = printAndSetExample
    runSelectedExample(exampleSelected)
  }

  private def printAndSetExample = {
    print(
      "What do you want?\n" +
        "1 - Read from console example.\n" +
        "2 - Read from file example.\n" +
        "3 - Error handling example.\n" +
        "4 - Sets example.\n" +
        "5 - Maps example.\n" +
        "6 - Tuples example.\n" +
        "7 - Arrays example.\n"
    )
    val option = readInt()
    option
  }

  private def runSelectedExample(option: Int): Unit = {
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
      case 5 =>
        val maps = new Maps()
        maps.example()
      case 6 =>
        val tuples = new Tuples()
        tuples.examples()
      case 7 =>
        val arrays = new Arrays()
        arrays.examples()
      case whoa => println("Invalid option: " + whoa.toString)
    }
  }

}
