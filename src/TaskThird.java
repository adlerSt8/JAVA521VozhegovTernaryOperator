import java.util.Scanner;

public class TaskThird {
    //TODO: Программа, которая проверяет, делится ли введенное пользователем
    // число нацело на 2 и 5 или на 3 и 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if ((number % 2 == 0) && (number % 5 == 0)
                || (number % 3 == 0) && (number % 7 == 0)) {
            System.out.println("Число " + number + " делится.");
        } else {
            System.out.println("Число не делится.");
        }
        scanner.close();
    }
}
