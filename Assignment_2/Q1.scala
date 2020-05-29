package q1

object Q1 extends App {
def wage(hours:Int):Int=hours*150;
  def ot(hours:Int):Int=hours*75;
  def income(wage_hours:Int,ot_hours:Int):Int=wage(wage_hours)+ot(ot_hours);
  def tax(income:Int):Double=income*10/100;
  def takehome(wage_hours:Int,ot_hours:Int):Double=income(wage_hours,ot_hours)-tax(income(wage_hours,ot_hours));

}
