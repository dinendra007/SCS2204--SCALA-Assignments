package cost

object cost extends App {
def discount(x:Double):Double=x*40/100;
  def price(x:Double):Double=x*24.95;
  def shipping(x:Int):Double={
    if(x>50){
      (3*x)+(0.75*(x-50));
    }
    else{
      3*x;
    }
  }
  def total(x:Int):Double=price(x)-discount(price(x))-shipping(x);
  println(total(60));
}
