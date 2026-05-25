import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to CI/Cd lab");
        Scanner input = new Scanner(System.in);

        double num1, num2;
        int choice;

        System.out.println("===== Calculator =====");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        switch(choice) {

            case 1:
                System.out.println("Answer = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Answer = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Answer = " + (num1 * num2));
                break;

            case 4:
                if(num2 != 0) {
                    System.out.println("Answer = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        input.close();


    }
}