//This Calculator program is used to perform basic arithmetic operation using hardcoded values

public class Calculator { //class declaration
  public static void main(String[] args) { //main method starts here
    int num1 = 20; //declaration and initialization of integer value
    double num2 = 3.14; //declaration and initialization of decimal value

    //arithmetic operation is carried out here
    double sum = num1+num2;
    double sub = num1-num2;
    double product = num1*num2;
    double division = num1/num2;

    //this section of code prints out the values after carrying out the operation
    System.out.println("Sum of number 1 and 2: " +sum);
    System.out.println("Subtraction of number 1 and 2: " +sub);
    System.out.println("Multiplication of number 1 and 2: " +product);
    System.out.println("Division of number 1 and 2: " +division);
  }
}
