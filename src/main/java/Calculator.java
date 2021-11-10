import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static double getInt() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else { throw new ArithmeticException("не то");
           // System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            //scanner.next();
           // operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case ('+'):
                result = num1 + num2;
                break;
            case ('-'):
                result = num1 - num2;
                break;
            case ('*'):
                result = num1 * num2;
                break;
            case ('/'):

                break;
            default:
                throw new ArithmeticException(" не то");
               // result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
