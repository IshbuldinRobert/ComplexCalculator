package Model.impl;

import Model.Calculable;
import Model.NumberClass.ComplexNumber;

public class Calculator implements Calculable {
    private ComplexNumber complexNumber1;
    private ComplexNumber complexNumber2;
    private ComplexNumber result;

    public Calculator(ComplexNumber num1, ComplexNumber num2) {
        this.complexNumber1 = num1;
        this.complexNumber2 = num2;
        this.result = new ComplexNumber(0, 0);
    }

    public ComplexNumber getComplexNumber1() {
        return complexNumber1;
    }

    public ComplexNumber getComplexNumber2() {
        return complexNumber2;
    }

    public ComplexNumber getResult() {
        return result;
    }

    @Override
    public void addition() {
        this.result.setReal(this.complexNumber1.getReal() + this.complexNumber2.getReal());
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