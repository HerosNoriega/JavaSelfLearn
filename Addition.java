import java.util.Scanner;

public class Addition{

  public static void main(String[] args){

    //Instance of the class Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("This algorithm will make the addition of two numbers");

    //Will display to read the first digit
    System.out.println("Enter first digit: ");
    int number1 = sc.nextInt();

    //Will display to read the first digit
    System.out.println("Enter second digit: ");
    int number2 = sc.nextInt();
    sc.close();

    //total will make the addition of both numbers provided before
    int total = number1 + number2;

    //This will print out the result of the previous
    System.out.println("This is the total of " + number1 + " plus " + number2 +
                        ": " + total);
  }
}
