public class ComplexNumberCalculator {
    private MathOperation addition;
    private MathOperation multiplication;
    private MathOperation division;
    private Logger logger;

    public ComplexNumberCalculator() {
        addition = new Addition();
        multiplication = new Multiplication();
        division = new Division();
        logger = new ConsoleLogger();
    }

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = addition.calculate(num1, num2);
        logger.log("Результат сложения: " + result.toString());
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = multiplication.calculate(num1, num2);
        logger.log("Результат умножения: " + result.toString());
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = division.calculate(num1, num2);
        logger.log("Результат деления: " + result.toString());
        return result;
    }
}