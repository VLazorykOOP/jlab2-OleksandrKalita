import java.lang.Math;

public class Complex {
    private double real; // Дійсна частина
    private double imaginary; // Уявна частина

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Модуль комплексного числа
    public double module() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Аргумент комплексного числа в радіанах
    public double argument() {
        return Math.atan2(imaginary, real);
    }

    // Додавання комплексних чисел
    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Віднімання комплексних чисел
    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Множення комплексних чисел
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    // Ділення комплексних чисел
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }

    // Комплексне спряження
    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    public double getNumber() {
        double result = this.real + this.imaginary * -1;
        return result;
    }
}