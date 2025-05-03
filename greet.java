import java.util.Scanner;

public class greet {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = input.nextLine();
      System.out.println("Welcome to Computer Science, " + name +"!");
  }
}
