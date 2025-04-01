package calculator;
import java.util.Scanner;
class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN; 

        }
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculator.Calculator calc = new calculator.Calculator();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = calc.add(num1, num2);
                break;
            case '-':
                result = calc.subtract(num1, num2);
                break;
            case '*':
                result = calc.multiply(num1, num2);
                break;
            case '/':
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return; 
        }

       System.out.println("Result: " + result);
       scanner.close();
    }
}