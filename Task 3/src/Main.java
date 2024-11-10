import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String validString = "123";
        try {
            int number = convertStringToInt(validString);
            System.out.println("Конвертированное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }

    // Функция для конвертации строки в целое число
    public static int convertStringToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}
