public class Main {
    public static void main(String[] args) {
        double num1 = Calculator.getInt();
        double num2 = Calculator.getInt();
        char operation = Calculator.getOperation();
        double result = Calculator.calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }
}
