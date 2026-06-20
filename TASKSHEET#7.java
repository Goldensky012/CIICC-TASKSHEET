import java.util.Scanner;

class TASKSHEET7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Call methods and print results
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        scanner.close();
    }

    // Method 1: Addition with return type
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 2: Subtraction with return type
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method 3: Multiplication with return type
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method 4: Division with return type
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.print("(Error: Cannot divide by zero) ");
            return 0;
        }
        return a / b;
    }
}
