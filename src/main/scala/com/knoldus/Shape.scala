package com.knoldus


trait Shape {
  val width: Double
  val height: Double

  def area: Double = {
    width * height
  }
}

object Shape {
  def main(args: Array[String]): Unit = {
    val objSquare = new Square(100)
    println("area of square: " + objSquare.area)
    val objRectangle = new Rectangle(10, 20)
    println("area of rectangle: " + objRectangle.area)
  }
}
