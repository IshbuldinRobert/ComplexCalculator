package Model.NumberClass;
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary > 0) return String.format("%s + %si", real, imaginary);
        else if (imaginary < 0) return String.format("%s - %si", real, Math.abs(imaginary));
        else return String.format("%s", real);
    }
}
