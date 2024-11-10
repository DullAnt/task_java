import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для нахождения квадратного корня: ");
        double number = scanner.nextDouble();

        try {
            double result = findSquareRoot(number);
            System.out.println("Квадратный корень из " + number + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static double findSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        return Math.sqrt(number);
    }
}
