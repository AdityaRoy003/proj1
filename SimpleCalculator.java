import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1: Addition (+)");
            System.out.println("2: Subtraction (-)");
            System.out.println("3: Multiplication (*)");
            System.out.println("4: Division (/)");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            double result = 0;
            boolean validChoice = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validChoice = false;
                    }
                    break;
                default:
                    validChoice = false;
                    System.out.println("Invalid choice! Please restart the program.");
            }

            if (validChoice) {
                System.out.println("Result: " + result);
                System.out.println("Thank you for using the calculator!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }
}
