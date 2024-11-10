import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];// изначальный список товаров
        int productCount = 0; // переменная для подсчёта добавленных товаров

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                //добавить товар
                System.out.println("Введите название товара:");
                String productName = scanner.next();
                int productCheck = 0;// переменная для проверки дубликата товара

                //увеличение товарной корзины
                if (productCount == shoppingList.length) {
                    String[] newshoppingList = new String[productCount + 1];
                    //копируем в расширенный список содержимое текущего списка
                    for (int i = 0; i < shoppingList.length; i++) {
                        newshoppingList[i] = shoppingList[i];
                    }
                    //замена списков
                    shoppingList = newshoppingList;
                }

                //проверка на совпадение товара
                if (productCount < shoppingList.length) {
                    for (int i = 0; i < productCount; i++) {
                        if (productName.equals(shoppingList[i])) {
                            productCheck = 1;
                        }
                    }
                    //добавление товара
                    if (productCheck == 0) {
                        productCount += 1;
                        shoppingList[productCount - 1] = productName;
                        System.out.println("Товар " + productName + " добавлен в список под номером " + productCount);
                    } else {
                        System.out.println("Такой товар уже есть в списке!");
                    }
                }
            } else if (actionNumber == 2) {
                // показать список
                for (int i = 0; i < shoppingList.length; i++) {
                    if (shoppingList[i] != null) {
                        System.out.println((i + 1) + ". " + shoppingList[i]);
                    }
                }
            } else if (actionNumber == 3) {
                // очистить список
                for (int i = 0; i < shoppingList.length; i++) {

                    shoppingList[i] = null;
                }
                productCount = 0;
            } else if (actionNumber == 4) {
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}
