package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {
    public double calculate(double x, double y, ArithmeticOperation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter arithmetic operation to perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationStr = sc.next().toUpperCase();
        ArithmeticOperation operation = ArithmeticOperation.valueOf(operationStr);

        System.out.println("Enter two numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        ArithmeticBase calculator = new ArithmeticBase();
        double result = calculator.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}
