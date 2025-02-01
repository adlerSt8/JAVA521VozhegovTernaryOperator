import java.util.Scanner;

public class TaskFirst {
    //TODO: Программа, которая проверяет, является ли введенное
    // пользователем число четным или нечетным
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        
        String evenOdd = (number % 2 == 0) ? "Число четное." : "Число нечетное.";
        System.out.println(evenOdd);

        scanner.close();
    }
}
