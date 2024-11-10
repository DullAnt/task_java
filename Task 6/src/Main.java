import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        try {
            long result = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static long calculateFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
