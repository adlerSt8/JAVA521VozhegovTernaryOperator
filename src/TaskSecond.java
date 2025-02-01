import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TaskSecond {
    //TODO: Ппрограмму, которая сравнивает два введенных числа
    // и выводит наибольшее из них
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberFirst = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberSecond = scanner.nextInt();
        String maxNumber = (numberFirst == numberSecond) ? "Числа " + numberFirst + " и " + numberSecond + " равны."
                :(numberFirst > numberSecond) ? "Наибольшее число " + " - " + numberFirst
                : "Наибольшее число " + " - " + numberSecond;
        System.out.println(maxNumber);
    }
}
