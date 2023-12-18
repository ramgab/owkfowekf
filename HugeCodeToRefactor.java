import java.util.Scanner;

public class HugeCodeToRefactor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Amazing Program!");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        if (name != null && !name.isEmpty()) {
            System.out.println("Hello, " + name + "! Let's get started.");

            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            System.out.println("Choose operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter operation number: ");
            int operationChoice = input.nextInt();

            double result = 0;

            switch (operationChoice) {
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
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation choice.");
                    return;
            }

            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Invalid name.");
        }
    }
}
