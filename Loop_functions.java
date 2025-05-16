//Looping using while, for and do while loops

public class Loop_functions {
  public static void main (String[] args) {

    //Using WHILE loop
    int count = 1;
    while (count <= 5) {
      System.out.println("Count is: " +count);
      count++;
    }

    System.out.println();
    
    //Using FOR loop
    for (int i = 1; i <= 5; i++) {
      System.out.println("Number: " +i);
    }
    
    System.out.println();

    //Using DO-WHILE loop
    
    int x = 1;
    do {
      System.out.println("x: " +x);
      x++;
    } while (x <= 5);
  }
}
