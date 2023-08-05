public class Main {
    public static void main(String[] args) {
        // Создаем комплексные числа
        ComplexNumber num1 = ComplexNumberFactory.createComplexNumber(3, 5);
        ComplexNumber num2 = ComplexNumberFactory.createComplexNumber(2, -7);

        // Создаем калькулятор
        ComplexNumberCalculator calculator = new ComplexNumberCalculator();

        // Выполняем операции
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);
    }
}
