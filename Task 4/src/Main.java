import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");
        Scanner sc = new Scanner(System.in);

        int validAge = sc.nextInt();
        try {
            checkAge(validAge);
            System.out.println("Возраст " + validAge + " корректен.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150.");
        }
    }
}

