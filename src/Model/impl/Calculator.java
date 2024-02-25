package Model.impl;

import Model.Calculable;
import Model.NumberClass.ComplexNumber;

public class Calculator implements Calculable {
    private ComplexNumber complexNumber1;
    private ComplexNumber complexNumber2;
    private ComplexNumber result;

    public Calculator() {
        this.complexNumber1 = new ComplexNumber(0, 0);
        this.complexNumber2 = new ComplexNumber(0, 0);
        this.result = new ComplexNumber(0, 0);
    }

    public ComplexNumber getComplexNumber1() {
        return complexNumber1;
    }
    public ComplexNumber getComplexNumber2() {
        return complexNumber2;
    }

    @Override
    public void updateComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        this.complexNumber1 = num1;
        this.complexNumber2 = num2;
    }

    @Override
    public ComplexNumber getResult() {
        return this.result;
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
        this.result.setReal((complexNumber1.getReal() * complexNumber2.getReal() +
                            complexNumber1.getImaginary() * complexNumber2.getImaginary()) /
                            (Math.pow(complexNumber2.getReal(), 2) + 
                            Math.pow(complexNumber2.getImaginary(), 2)));
        this.result.setImaginary((complexNumber1.getImaginary() * complexNumber2.getReal() - 
                                complexNumber1.getReal() * complexNumber2.getImaginary()) /
                                (Math.pow(complexNumber2.getReal(), 2) + 
                                Math.pow(complexNumber2.getImaginary(), 2)));
    }

    @Override
    public void multiplication() {
        this.result.setReal((complexNumber1.getReal() * complexNumber2.getReal()) +
                            + ((-1) * complexNumber1.getImaginary() * complexNumber2.getImaginary()));
        this.result.setImaginary(complexNumber1.getReal() * complexNumber2.getImaginary() +
                            + (complexNumber1.getImaginary() * complexNumber2.getReal()));
    }
}