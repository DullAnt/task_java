import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        try {
            checkForZeros(array);
            System.out.println("В массиве нет нулей.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkForZeros(int[] array) throws IllegalArgumentException {
        for (int value : array) {
            if (value == 0) {
                throw new IllegalArgumentException("Массив содержит нули.");
            }
        }
    }
}