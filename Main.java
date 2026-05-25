import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to CI/Cd lab");

        // If command-line args provided: use them as (choice num1 num2)
        if (args.length >= 3) {
            try {
                int choice = Integer.parseInt(args[0]);
                double num1 = Double.parseDouble(args[1]);
                double num2 = Double.parseDouble(args[2]);
                calculate(choice, num1, num2);
            } catch (Exception e) {
                System.err.println("Invalid arguments. Usage: <choice> <num1> <num2>");
                System.exit(1);
            }
            return;
        }

        // If running in a non-interactive environment (like CI), run a demo and exit
        if (System.console() == null) {
            System.out.println("Non-interactive environment detected — running demo");
            calculate(1, 2.0, 3.0);
            return;
        }

        // Interactive mode (original behaviour)
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

        calculate(choice, num1, num2);

        input.close();
    }

    private static void calculate(int choice, double num1, double num2) {
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
    }
}