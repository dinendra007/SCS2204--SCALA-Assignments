package Q2

object Q2 extends App {
  def gcd(a:Int,b:Int):Int= b match {
    case 0=>a
    case x if(x>a)=>gcd(x,a)
    case _ => gcd(b,a%b)
  }

  def prime(p:Int,n:Int=2):Boolean=n match {
    case x if(x==p)=>true
    case x if(gcd(p,x)>1)=>false
    case x=>prime(p,x+1)

  }

  def primeSq(n:Int):Unit={
    if (prime(n)) printf("%d\n",n)
    if(n>2) primeSq(n-1)
  }

}
