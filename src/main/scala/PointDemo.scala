object PointDemo {
  def main(args: Array[String]) {
    val pt = new Point(10, 20)

    // Move to a new location
    pt.move(10, 10)

    val anotherPoint = new Point(30, 30)
    anotherPoint.move(30, 30)

    val location = new Location(12, 12, 23)
    location.move(23, 343, 33)
  }
}