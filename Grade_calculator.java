//Program to accept number grade as input and return letter grade

import java.util.Scanner; //import the scanner slass to allow & read user input

public class Grade_calculator {
  public static void main(String[] args) { //main method starts here
    
    Scanner input = new Scanner(System.in); //create a scanner to get user input
    System.out.print("Enter your grade: ");
    int grade = input.nextInt();

    if (grade >= 90) { //checks the input number grade against the letter grade system
      System.out.println("Grade: A"); //prints out the appropriate grade
    } else if (grade >= 80) {
      System.out.println("Grade: B");
    } else if (grade >= 70 && grade <= 79) {
      System.out.println("Grade: C");
    }else if (grade >= 60 && grade <= 69) {
      System.out.println("Grade: D");
    }else {
      System.out.println("Grade: F");
    }
  }
}
