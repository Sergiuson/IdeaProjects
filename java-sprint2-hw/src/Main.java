import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        System.out.println("Здраствуйте, вас приветсвует программа счётчик калорий!");

        // Цикл обработки команд программы
        while (true){
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                stepTracker.changeStepGoal();
            } else if (command == 2){
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 3){
                stepTracker.printStatistic();
            } else if (command == 4){
                System.out.println("Программа завершена");
                break;
            } else{
                System.out.println("Неизвестная команда");
            }
            System.out.println();
            System.out.println();
            System.out.println("--------------------------------------");
        }

    }
    static void printMenu(){
        System.out.println("""
        Выберете команду:
        1 - Добавление цели по количеству шагов в день
        2 - Добавление количества пройденных шагов за день
        3 - Вывод статистики за определённый месяц
        4 - Выход из программы
        """);
    }
}