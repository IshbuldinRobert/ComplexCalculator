package Model;

public class ComplexNumber implements Calculable{
    double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double[] addition(double real, double imaginary) {
        return new double[]{};
    }

    @Override
    public double[] subtraction(double real, double imaginary) {
        return new double[0];
    }

    @Override
    public double[] division(double real, double imaginary) {
        return new double[0];
    }

    @Override
    public double[] multiplication(double real, double imaginary) {
        return new double[0];
    }
}
