import java.lang.Math;

public class ComplexNumber {
    private double real; // Дійсна частина
    private double imaginary; // Уявна частина

    public ComplexNumber(double real, double imaginary) {
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
    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Віднімання комплексних чисел
    public ComplexNumber subtract(ComplexNumber other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Множення комплексних чисел
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Ділення комплексних чисел
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Комплексне спряження
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imaginary);
    }

    public double getNumber() {
        double result = this.real + this.imaginary * -1;
        return result;
    }
}



// import java.lang.Math;

// public class ComplexValue {
//     private double real; // Дійсні частина 
//     private double imaginary; // Уявна частина

//     public ComplexValue(double real, double imaginary) {
//         this.real = real;
//         this.imaginary = imaginary;
//     }

//     // Модуль
//     public void module() {
//         return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
//     }
//     // Аргумент
//     public void argument() {
//         return Math.atan2(this.imaginary, this.real);
//     }

//     // Додавання комплексних чисел
//     public ComplexValue add(ComplexValue other) {
//         double realPart = this.real + other.real;
//         double imaginaryPart = this.imaginary + other.imaginary;
//         return new ComplexValue(realPart, imaginaryPart);
//     }

//     // Віднімання комплексних чисел
//     public ComplexValue subtract(ComplexValue other) {
//         double realPart = this.real - other.real;
//         double imaginaryPart = this.imaginary - other.imaginary;
//         return new ComplexValue(realPart, imaginaryPart);
//     }

//     // Множення комплексних чисел
//     public ComplexValue multiply(ComplexValue other) {
//         double realPart = this.real * other.real - this.imaginary * other.imaginary;
//         double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//         return new ComplexValue(realPart, imaginaryPart);
//     }

//     // Ділення комплексних чисел
//     public ComplexValue divide(ComplexValue other) {
//         double denominator = other.real * other.real + other.imaginary * other.imaginary;
//         double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
//         double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
//         return new ComplexValue(realPart, imaginaryPart);
//     }

//     // Комплексне спряження
//     public ComplexValue conjugate() {
//         return new ComplexValue(this.real, -this.imaginary);
//     }
// }