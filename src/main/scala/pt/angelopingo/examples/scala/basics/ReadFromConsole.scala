package pt.angelopingo.examples.scala.basics

class ReadFromConsole {

  def readStudentGrade(): Unit = {
    println("Enter the student name: ")
    val name = readLine()
    println("\nEnter student score: ")
    val score = readFloat()
    println("\nStudent " + name + " has a score of " + score)
  }

}
