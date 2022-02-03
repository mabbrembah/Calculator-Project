import java.util.Scanner;
public class Calculator {
    static String resultMessage = "The result is ";

   //addition
   public  static int add(int a, int b) {
        int sum = a+b;
        System.out.println(resultMessage + sum);
        return sum;

    }
   //subtraction
   public  static int subtract(int c, int d) {
       int difference = c-d;
       System.out.println(resultMessage + difference);
       return difference;

   }

   // division
    public  static double divide(int e, int f) {
       int division = e/f;
        System.out.println(resultMessage + division);
       return division;

    }

    //modulo
    public  static double modulo(int g, int h) {
       double modulo = g%h;
        System.out.println(resultMessage + modulo);
       return modulo;

    }

    public static void main (String[]args){
       // ask user for prompt
        Scanner userPreference = new Scanner(System.in);
        System.out.print("Please select operation: ");
        String operation = userPreference.nextLine();

        //take in numbers
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = numbers.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber= numbers.nextInt();

        switch(operation){
            case "add":
                add(firstNumber,secondNumber);
                break;

            case "subtract":
                subtract(firstNumber,secondNumber);
                break;

            case "divide":
                divide(firstNumber,secondNumber);
                break;

            case "modulo":
                modulo(firstNumber,secondNumber);
                break;

            default:
                System.out.println("Please provide type of operation");

        }
    }
}
