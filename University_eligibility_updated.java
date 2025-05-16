import java.util.Scanner;
//Program to check if someone is eligible to enter a university (updated with feedback)

public class University_eligibility_updated {
  public static void main(String[] args) {//main method starts here
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Have you completed secondary school (Yes/No)? ");
    String completedSchool = input.next();

    System.out.print("Did you pass the Entrance examination (UTME)? ");
    String passedUtme = input.next();
    
    //individual Feedback
   if (age < 17) {
     System.out.println("You must be at least 17 years old.");
    }
   if (!completedSchool.equalsIgnoreCase("yes")) {
      System.out.println("You must have completed secondary school.");
    }
   if (!passedUtme.equalsIgnoreCase("yes")) {
      System.out.println("You must pass the entrance examination.");
    }

   //Final decision based on all conditions

   if (age >= 17 && completedSchool.equalsIgnoreCase("yes") && passedUtme.equalsIgnoreCase("yes")) {
     System.out.println("Congratulations! You are eligible to gain admission into the university.");
   } else {
     System.out.println("Unfortunately, you are  not eligible at this time.");
   }
  }
}  
