import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println("Select an operation: +, -, *, /, √, %, mean");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("Enter two numbers:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case "-":
                System.out.println("Enter two numbers:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case "*":
                System.out.println("Enter two numbers:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case "/":
                System.out.println("Enter two numbers:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                if (b != 0) {
                    System.out.println("Result: " + calculator.divide(a, b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case "√":
                System.out.println("Enter a number:");
                a = scanner.nextDouble();
                if (a >= 0) {
                    System.out.println("Result: " + calculator.squareRoot(a));
                } else {
                    System.out.println("Cannot calculate square root of a negative number");
                }
                break;
            case "%":
                System.out.println("Enter two numbers:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println("Result: " + calculator.percentage(a, b));
                break;
            case "mean":
                System.out.println("Enter the number of elements:");
                int n = scanner.nextInt();
                double[] numbers = new double[n];
                System.out.println("Enter the numbers:");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextDouble();
                }
                System.out.println("Result: " + calculator.mean(numbers));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        scanner.close();
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double percentage(double a, double b) {
        return (a / b) * 100;
    }

    public double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
