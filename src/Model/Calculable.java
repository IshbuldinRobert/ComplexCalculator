package Model;

import Model.NumberClass.ComplexNumber;

public interface Calculable {
    void addition();
    void subtraction();
    void division();
    void multiplication();
    void updateComplexNumbers(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber getResult();
}
