package Q3

object Q3 extends App {
  def add(n:Int):Int=n match {
    case 0=>0
    case _=>n+add(n-1)
  }

def printsum(n:Int)=println(add(n));


}
