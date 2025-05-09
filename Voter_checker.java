//Eligibility checker program for voters using logical operations

import java.util.Scanner;

public class Voter_checker {
  public static void main(String[] args) { //main method starts here
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Are you a citizen: ");
    String citizenship = input.next();

    if (age >= 18 && citizenship.equalsIgnoreCase("yes")) {
      System.out.println("You are eligible to vote.");
    } else {
      System.out.println("Sorry, you are not eligible to vote.");
    }

  }
}
