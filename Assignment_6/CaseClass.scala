package Assignment06

object CaseClass extends App{

  val x1 = Point(5,1)
  val x2 = Point(6,9)
  val x3 = x1 + x2
  val x4 = x1.move(1,2)
  val x5 = x2.invert()
  val distance = x1.distance(3,4)


  println(x1)//x1 Point
  println(x2)//x2 Point
  print("Q1 :")
  println(x3)// addition of x1 and x2
  print("Q2 :")
  println(x4)// move x1 from x axis by dx and y axis by dy
  print("Q3 :")
  println(x5)
  print("Q4 :")
  println(distance)// print distance
}

case class Point(a:Int,b:Int){
  def x:Int = a;
  def y:Int = b;
  // Add two points(Q1)
  def +(that:Point) = Point(this.x+that.x,this.y + that.y)
  // move a point to the given destination(Q2)
  def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)
  // return distance between two points(Q3)
  def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))
  // switch coordinate values(Q4)
  def invert() = Point(this.y,this.x)

}
