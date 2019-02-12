package pt.angelopingo.examples.scala.basics

class Sets {

  def example(): Unit = {
    var numbers1 = Set(1, 2, 3, 4, 5)
    val numbers2 = Set(10, 20, 30, 40, 50)

    println("[INITIAL STATE] numbers1: " + numbers1)
    println("[INITIAL STATE] numbers2: " + numbers2)
    println()
    println("[Contains element?]\t(numbers1.contains(4)):\t" + numbers1.contains(4))
    println("[Contains element?]\t(numbers1(2)):\t" + numbers1(2)) // same of contains
    println("[Mix 2 Sets]\t\t(numbers1 ++ numbers2):\t" + (numbers1 ++ numbers2)) // no guarantees order
    numbers1 -= 1
    println("[Remove element]\t(numbers1 -= 1):\t" + numbers1)
    numbers1 += 10
    println("[Add element]\t\t(numbers1 += 10):\t" + numbers1)
    println("[Intersection]\t\t(numbers1 & numbers2):\t" + (numbers1 & numbers2))
    println("[First element]\t\t(numbers1.head):\t" + numbers1.head)
    println("[All element except first]\t\t(numbers1.tail):\t" + numbers1.tail)
    println("[Is empty?]\t\t(numbers1.isEmpty):\t" + numbers1.isEmpty)
  }

}
