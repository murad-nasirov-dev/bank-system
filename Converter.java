import java.util.Scanner;

public class Main{

  public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    final double USD_RATE = 1.70;
    final double EURO_RATE = 1.85;
    
    System.out.print("Please the amount you want to convert (AZN): ");

    if (scanner.hasNextDouble()) {

      double AZN = scanner.nextDouble();
      if (AZN > 0){

      

      double USD = AZN / USD_RATE;
      double EURO = AZN / EURO_RATE;

      System.out.println("\n ------- Result ------");
      System.out.printf("USD: %.2f $ \n", USD);
      System.out.printf("EURO: %.2f € \n", EURO);
    } else {

      System.out.print("Please enter the positive number!"); 
    }
  } else {

  
     
      System.out.print("Please enter the valid number!");
    }
  scanner.close();
  } 
}
