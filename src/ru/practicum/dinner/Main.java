import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;
   //текст
    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);
        //цикл обработки запроса пользователя через меню программы
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    addNewDish();
                    break;
                case "2":
                    generateDishCombo();
                    break;
                case "3":
                    return;
            }
        }
    }
    //метод вызова меню программы
    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }
    //метод добавления нового блюдо в меню ресторана
    private static void addNewDish() {
        System.out.println("Введите тип блюда:");
        String dishType = scanner.nextLine();

        System.out.println("Введите название блюда:");
        String dishName = scanner.nextLine();
        // добавление нового блюдо
        dc.addDish(dishType, dishName);

    }
    //метод генерации комбо из блюд меню
    private static void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        String nextItem = scanner.nextLine();
        //объявление  списка типов блюд для генерации комбо
        ArrayList<String> listType = new ArrayList<>();
        //объявление списка комбо, генерированного
        ArrayList<String> listCombo = new ArrayList<>();

        //ввод типов блюд через ENTER
        while (!nextItem.isEmpty()) {

            if (dc.checkType(nextItem)) {
                listType.add(nextItem);
            } else {
                System.out.println("Указанный вами тип блюда нет в перечне известных типов меню : ");
                dc.seeTypeDish();
                System.out.println("Введите пожалуйста один из известных типов блюд");
            }
            nextItem = scanner.nextLine();
        }

        // генерирация комбинации блюд и вывод на экран
        for (int i = 0; i < numberOfCombos; i++) {
            listCombo.clear();
            System.out.println("Комбо " + (i + 1));
            for (String thisType : listType) {
                listCombo.add(dc.randomDishType(thisType));
            }
            System.out.println(listCombo);
        }


    }
}
