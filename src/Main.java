import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x1;
        String x2;
        int num1;
        int num2;
        int result = 0;
        char symbol = '+';
        String input;
        String оperations;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        Number_system num_systems = new Number_system();
        Operation choosing_an_operation = new Operation();


        System.out.println("Выберите систему счисления для первого числа ");
        num_systems.change_system();
        input = scanner.nextLine();
        System.out.println("Введите первое число");
        x1 = scanner.nextLine();
        num1 = num_systems.numbers(x1, input);
        System.out.println("Выберите систему счисления для второго числа");
        num_systems.change_system();
        System.out.println("Введите второе число");
        input = scanner.nextLine();
        x2 = scanner.nextLine();
        num2 = num_systems.numbers(x2, input);
        System.out.println("Выберите операцию");
        symbol = scanner.next().charAt(0);
        оperations = choosing_an_operation.choice(symbol);
        if (оperations != null) {
            result = calc.operation(оperations,num1,num2);

        } else {
            System.out.println("Неверно введена операция");
        }
        System.out.println("Ответ в двоичной системе счисления: " + Integer.toBinaryString(result));
        System.out.println("Ответ в восьмеричной системе счисления: " + Integer.toOctalString(result));
        System.out.println("Ответ в десятичной системе счисления: " + result);
        System.out.println("Ответ в шестнадцатеричной системе счисления: " + Integer.toHexString(result));
    }
}