//Job eligilibity checker program

import java.util.Scanner;

public class Job_eligibility_checker {
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Do you have a degree (Yes/No)? ");
    String degreeStatus = input.next();

    System.out.print("How many years of experience do you have? ");
    int experience = input.nextInt();

    //Individual Feedback
    if (age < 18) {
      System.out.println("You must be at least 18 years old.");
    }
    if (!degreeStatus.equalsIgnoreCase("Yes")) {
      System.out.println("You need to have a degree to be eligible.");
    }
    if (experience < 2) {
      System.out.println("You are required to have at least 2 years experience to be eligible.");
    }

    //Final decision
    if (age < 18 || !degreeStatus.equalsIgnoreCase("Yes") || experience < 2) {
      System.out.println("Sorry, you are not eligible to get a job.");
    } else {
      System.out.println("Congratulations, you are eligible for a job.");
    }
  }
}
