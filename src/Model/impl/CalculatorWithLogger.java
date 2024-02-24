package Model.impl;

import Model.Calculable;
import Model.NumberClass.ComplexNumber;

public class CalculatorWithLogger implements Calculable {
    private Calculator calculator;

    public CalculatorWithLogger(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void addition() {
        this.calculator.getResult.setReal(this.complexNumber1.getReal() + this.complexNumber2.getReal());
        this.result.setImaginary(this.complexNumber1.getImaginary() + this.complexNumber2.getImaginary());
    }

    @Override
    public void subtraction() {
        this.result.setReal(this.complexNumber1.getReal() - this.complexNumber2.getReal());
        this.result.setImaginary(this.complexNumber1.getImaginary() - this.complexNumber2.getImaginary());
    }

    @Override
    public void division() {
    }

    @Override
    public void multiplication() {
    }

    @Override
    public void clear() {
        this.result = new ComplexNumber(0, 0);
    }
}
