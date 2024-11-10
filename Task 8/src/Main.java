import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание : ");
        double base = scanner.nextDouble();

        System.out.print("Введите степень : ");
        int exponent = scanner.nextInt();

        try {
            double result = calculatePower(base, exponent);
            System.out.println(base + " в степени " + exponent + " равно: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static double calculatePower(double base, int exponent) throws IllegalArgumentException {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
 }
