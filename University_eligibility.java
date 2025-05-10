import java.util.Scanner;
//Program to check if someone is eligible to enter a university

public class University_eligibility {
  public static void main(String[] args) {//main method starts here
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Have you completed secondary school(Yes/No)? ");
    String completedSchool = input.next();

    System.out.print("Did you pass the Entrance examination(UTME)? ");
    String passedUtme = input.next();

    if (age >= 17 && completedSchool.equalsIgnoreCase("yes") && passedUtme.equalsIgnoreCase("yes")) {
      System.out.println("Congratulations, you are eligible to gain admission into the University");
    } else {
      System.out.println("Sorry, you are not eligible to gain admission into the University");
    }


  }
}
