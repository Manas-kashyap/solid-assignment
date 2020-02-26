package com.knoldus

trait Solution {
  def area(breadth: Double, length: Double): Double = {
    breadth * length
  }

}

class Rectangle extends Solution {
  override def area(breadth: Double, length: Double): Double = {
    breadth * length
  }
}

class Square extends Rectangle {
  override def area(breadth: Double, length: Double): Double = {


    if (breadth == length) {
      breadth * breadth
    }
    else
      super.area(length, breadth)
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val objectRectangle = new Rectangle
    print(objectRectangle.area(10, 100) + "    ")
    val objectSquare = new Square
    print(objectSquare.area(10, 10))
  }
}
