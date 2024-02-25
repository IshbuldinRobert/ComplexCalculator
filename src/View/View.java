package View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Model.Calculable;
import Model.NumberClass.ComplexNumber;
import Model.impl.Calculator;
import Model.impl.CalculatorWithLogger;
import util.Operators;

public class View {
    private Calculable calculator;
    private ComplexNumber num1, num2;
    private List<String> validOperators;

    public View() {
        this.calculator = new CalculatorWithLogger();
        this.num1 = new ComplexNumber(0, 0);
        this.num2 = new ComplexNumber(0, 0);
        this.validOperators = Arrays.stream(Operators.values())
                            .map(Operators::operator)
                            .collect(Collectors.toList());
    }

    public void start() {
        while (true) {
            prepare();
            String startAgain = prompt();
            if (startAgain.equalsIgnoreCase("y")) prepare();
            else System.exit(0);
        }
    }

    public void prepare() {
        newComplexNumber("Enter the first complex number:", this.num1);
        newComplexNumber("Enter the second complex number:", this.num2);

        calculator.updateComplexNumbers(num1, num2);
        String operator = getOperator();
        switch (operator) {
            case "+":
                calculator.addition();
                break;
            case "-":
                calculator.subtraction();
                break;
            case "*":
                calculator.multiplication();
                break;
            case "/":
                calculator.division();
                break;
        }
        System.out.printf("Result: (%s) %s (%s) = %s\n", num1, operator, num2, calculator.getResult());
    }

    private String getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сhoose an operation ('+', '-', '/', '*'): ");
        String operator = in.nextLine().trim();
        while (true) {
            if (!validOperators.contains(operator)) {
                System.err.println("Operator is invalid... ");
                operator = getOperator();
            }
            else return operator;
        }
    }

    private void newComplexNumber(String message, ComplexNumber number) {
        System.out.println(message);
        number.setReal(inputDoubleNumber("Real: "));
        number.setImaginary(inputDoubleNumber("Imaginary: "));
    }

    private double inputDoubleNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String text = in.nextLine();
        double result = -1;
        try {
            result = Double.parseDouble(text);
        } catch (Exception e) {
            System.err.println("Input data is not the double number! Try again");
            result = inputDoubleNumber(message);
        }
        return result;
    }

    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Continue?... (y/n)");
        String action = in.nextLine().trim();
        return action;
    }
}