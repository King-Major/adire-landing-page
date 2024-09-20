import java .util.scanner;

public class SimpleInterestCalculator{
public ststic void main(string[]args){
  scanner imput = new scanner();

  double p,r,t,si;
  
  system.out.println("please enter principle amount")
  p = imput.nextdouble();
  
  system.out.println("please enter rate of interest")
  r = imput.nextdouble();
  
  system.out.println("please enter the time")
  t = imput.nextdouble();
  scanner.close();
  
  si =(p*r*t)/100;
  
  system.out.println("your simple interest is: "+ si)
  
  }
}

