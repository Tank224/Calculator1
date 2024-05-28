public class Calculator {
    public int addition(int x1, int x2) {
        return x1 + x2;
    }

    public int subtraction(int x1, int x2) {
        return x1 - x2;
    }

    public int multiplication(int x1, int x2) {
        return x1 * x2;
    }

    public int division(int x1, int x2) {
        if (x2 == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        }
        return x1 / x2;
    }

    public int operation(String operation, int x1, int x2) {
        switch (operation) {
            case "addition":
                return addition(x1, x2);
            case "subtraction":
                return subtraction(x1, x2);
            case "multiplication":
                return multiplication(x1, x2);
            case "division":
                return division(x1, x2);
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operation);
        }
    }
}