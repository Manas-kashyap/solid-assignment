package com.knoldus

class Rectangle(length: Double, breadth: Double) extends Shape {
  override val width: Double = length
  override val height: Double = breadth
}