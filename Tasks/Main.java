import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа:");

        int a = sc.nextInt();
        int b = sc.nextInt();


        try {
            if (a == b) {
                throw new Exception("Числа равны, невозможно определить максимум.");
            } else {
                int max = (a > b) ? a : b;
                System.out.println("Максимум: " + max);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
        }

