import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите количество символов для обрезки: ");
        int numChars = scanner.nextInt();

        try {
            String trimmedString = trimString(inputString, numChars);
            System.out.println("Обрезанная строка: " + trimmedString);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static String trimString(String str, int numChars) throws IllegalArgumentException {
        if (numChars > str.length()) {
            throw new IllegalArgumentException("Количество символов больше длины строки.");
        }
        return str.substring(0, numChars);
    }
}
