package Q5

object Q5 extends App{
  def isEven(n:Int):Boolean= n match {
    case 0=>true
    case _ => isOdd(n-1)
  }
  def isOdd(n: Int):Boolean= !(isEven(n))

  def add(n:Int):Int=n match {
    case 0=>0
    case x if(isEven(x))=>x+add(x-1)
    case x if(!isEven(x))=>add(x-1)
  }

  def printsum(n:Int)=println(add(n-1));


}
