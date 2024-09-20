import jaa.util.scanner;

public class RetirementAge{
  public ststic void main(string[]args){

    Scanner input = new

    int dateofbirth,currentyear,age;

    system.out.println("please enter date of birth");
    dateofbirth = input.nextint();

    system.out.println("please enter current date");
    currentyear = input.nextint();

    age = dateofbirth - currentyear;

    if (age >= 60){
      system.out.println("this employee has reached the age of retirement");
    }
    
  else {
    system.out.println("this employee is under the age of retirement");
  }
   
    
  }
}