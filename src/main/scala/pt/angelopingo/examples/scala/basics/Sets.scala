package pt.angelopingo.examples.scala.basics

class Sets {

  def example(): Unit = {
    var nums1 = Set(1, 2, 3, 4, 5)
    var nums2 = Set(10, 20, 30, 40, 50)

    println("[Contains element]\t(nums1.contains(4))\t: " + nums1.contains(4))
    println("[Contains element]\t(nums1(2))\t: " + nums1(2)) // same of contains
    println("[Mix 2 Sets]\t\t(nums1 ++ nums2)\t: " + (nums1 ++ nums2)) // no guarantees order
    nums1 -= 1
    println("[Remove Element]\t(nums1 -= 1)\t: " + nums1)
    nums1 += 10
    println("[Add Element]\t\t(nums1 += 10)\t: " + nums1)
    println("[Intersection]\t\t(nums1 & nums2)\t: " + (nums1 & nums2))
    println("[First Element]\t\t(nums1.head)\t: " + nums1.head)
    println("[All Element except first]\t\t(nums1.tail)\t: " + nums1.tail)
    println("[Is empty?]\t\t(nums1.isEmpty)\t: " + nums1.isEmpty)
  }

}
