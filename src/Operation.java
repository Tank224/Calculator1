public class Operation {
    private String operation; // Инициализируем переменную как null

    public String choice(char symbol) {
        switch (symbol) {
            case '+':
                operation = "addition";
                System.out.println("Вы выбрали сложение");
                break;
            case '-':
                operation = "subtraction";
                System.out.println("Вы выбрали вычитание");
                break;
            case '*':
                operation = "multiplication";
                System.out.println("Вы выбрали умножение");
                break;
            case '/':
                operation = "division";
                System.out.println("Вы выбрали деление");
                break;
            default:
                System.out.println("Неверно введена операция");
                break;
        }
        return operation; // Возвращаем operation, а не операнды
    }
}

