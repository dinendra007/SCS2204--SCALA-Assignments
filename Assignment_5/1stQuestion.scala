object NegativeRationalNumber extends App{
  var x = new Rational(4,7);
  println(x.negative);
}

class Rational(numer:Int,denom:Int){
  val numerator = if (numer >= 0) numer/gcd(numer,denom) else (numer/gcd(-numer,denom));
  val denominator = if (numer >= 0) denom/gcd(numer,denom) else denom/gcd(-numer,denom);
  def + (r:Rational) = new Rational((this.numerator*r.denominator)+(this.denominator*r.numerator),this.denominator*r.denominator);
  def negative = new Rational(-this.numerator,this.denominator);
  def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a%b);
  override def toString: String = this.numerator + "/" +  this.denominator;
}