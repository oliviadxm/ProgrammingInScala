package chapter_12

class Rectangle(val topLeft: Point, val bottomRight: Point)
    extends Rectangular {
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}
