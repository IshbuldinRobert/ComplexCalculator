package View;

import java.util.Scanner;

import Model.NumberClass.ComplexNumber;
import Model.impl.Calculator;

public class View {
    private Calculator calculator;

    public View() {
        this.calculator = new Calculator(new ComplexNumber(0, 0), new ComplexNumber(0, 0));
    }

    public void start() {
        try {
            newComplexNumber();
        } catch (Exception e) {
            System.err.println("Please, enter the double number!");
        }
        
    }

    private void newComplexNumber() {
        this.calculator.getComplexNumber1().setReal(prompt("Real: "));
        this.calculator.getComplexNumber1().setReal(prompt("Imaginary: "));
    }

    private double prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String text = in.nextLine();
    }

    private boolean isDouble() {
        try {
            
        } catch (Exception e) {
            // System.err.println(("Please, enter the double number!");
        }
    }
}
