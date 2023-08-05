public class Multiplication implements MathOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double realProduct = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryProduct = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realProduct, imaginaryProduct);
    }
}
