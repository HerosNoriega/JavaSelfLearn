import java.util.Scanner;

public class LargestInt{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in   );
    System.out.println("Find the greatest number");

    System.out.println("Enter first digit");
    int number1 = sc.nextInt();

    System.out.println("Enter second digit");
    int number2 = sc.nextInt();

    System.out.println("Enter third digit");
    int number3 = sc.nextInt();
    sc.close();

    if(number1 > number2){
      if(number1 > number3){
        System.out.println("This is the greates number " + number1);
      }else{
        System.out.println("This is the greates number " + number3);
      }
    }else{
      if(number2 > number3){
        System.out.println("This is the greates number " + number2);
      }else{
        System.out.println("This is the greates number " + number3);
      }
    }

  }
}
