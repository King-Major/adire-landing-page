import java.util.scanner;

public class SumProduct{

  public ststic void main(string[]args){
    scanner input = new scanner(system.in);

    int a, b, sum, product;

    system.out.println("please enter your first number");
    a = input.nextint();

    system.out.println("please enter your second number");
    b = input.nextint();

    sum = a + b;

    product = a*b;

    system.out.println("the sum of the two numbers is: "+ sum);
    system.out.println("the product of the two numbers is: "+ product)

    scanner.close();
    
  }
}