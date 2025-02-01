import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TaskFirst {
    //TODO: Программу, которая проверяет, является ли введенное
    // пользователем число четным или нечетным
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        String evenOdd = (number % 2 == 0) ? "Число четное." : "Число нечетное.";
        System.out.println(evenOdd);
    }
}
