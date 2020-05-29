package q2

object q2 extends App {
  def attendees(price:Int):Int= 120+(15-price)/5*20;
  def revenue(price:Int):Int=attendees(price)*price;
  def cost(price:Int):Int=500+attendees(price)*3;
  def profit(price:Int):Int=revenue(price)-cost(price);


}
