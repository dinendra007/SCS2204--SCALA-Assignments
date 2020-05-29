object Q4 extends App {
def isEven(n:Int):Boolean= n match {
  case 0=>true
  case _ => isOdd(n-1)
}
  def isOdd(n: Int):Boolean= !(isEven(n))

  def even_odd(n:Int)=if(isEven(n)) println("Even")
  else println("Odd")

}
