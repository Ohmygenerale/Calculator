import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        try {
            calc(line);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static void calc(String input) throws Exception {
        String[] part = input.split(" ");
        if (part.length < 3)
            throw new Exception("т.к. строка не является математической операцией");
        if (part.length > 3)
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        int number1 = Integer.parseInt(part[0]);
        int number2 = Integer.parseInt(part[2]);
        if ((number2 <= 0 || number1 <= 0) || (number2 > 10 || number1 > 10))
            throw new Exception("Ошибка ввода. Вводите числа от 1 до 10");
        char operator = part[1].charAt(0);
        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Ошибка ввода оператора");

        }
    }
}