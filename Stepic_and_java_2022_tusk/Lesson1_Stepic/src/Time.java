import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner  console = new Scanner(System.in);
        System.out.println("Введите число дней:");
        int time = console.nextInt();
        int years = time / 365;
        int months = (time % 365) / 30;
        int days = (time % 365) % 30;
        System.out.println("Число лет = " + years);
        System.out.println("Число месяцев = " + months);
        System.out.println("Число дней = " + days);
    }
}
