import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation number:");
        System.out.println("1 = Addition\n2 = Subtraction\n3 = Division\n4 = Multiplication");

        int button = sc.nextInt();

        System.out.println("Enter first operand:");
        int a = sc.nextInt();
        System.out.println("Enter second operand:");
        int b = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;

            case 3:
                if (b != 0) {
                    System.out.println("Division: " + ((double) a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case 4:
                System.out.println("Multiplication: " + (a * b));
                break;

            default:
                System.out.println("Invalid operation. Choose between 1 and 4.");
        }

        sc.close();
    }
}
