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
        System.out.print("Введите элемент для поиска: ");
        int elementToFind = scanner.nextInt();
        try {
            int index = findElement(array, elementToFind);
            System.out.println("Элемент " + elementToFind + " найден на индексе: " + index);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int findElement(int[] array, int element) throws IllegalArgumentException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве.");
    }
}
