public class Division implements MathOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realQuotient = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryQuotient = (num2.getReal() * num1.getImaginary() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }
}
