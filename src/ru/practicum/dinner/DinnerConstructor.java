import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;


public class DinnerConstructor {
    //объявления таблицы тип блюда - список блюд
    HashMap<String, ArrayList<String>> typeDish;


    DinnerConstructor() {

        typeDish = new HashMap<>();

    }
    // метод записи типа блюд и списка блюд, принадлежащих данному типу
    void addDish(String type, String dish) {

        for (String this_type : typeDish.keySet()) {
            //если указанный тип уже есть в таблице типов блюд
            if (type.equals(this_type)) {
                //добавление в список по указанному типу блюд
                typeDish.get(this_type).add(dish);
                return;
            }
        }
        //если указанного типа блюд нет в таблице
        if (!checkType(type)) {
            //объявление пустого списка блюд для нового типа
            ArrayList<String> newEat = new ArrayList<>();
            //вставка нового типа блюд с его списоком блюд
            typeDish.put(type, newEat);
            //обновление списка блюд по новому типу блюд
            typeDish.get(type).add(dish);
        }
        return;

    }
    //метод показывающий набор существующих в таблице типов блюд
    void seeTypeDish() {
        System.out.println(typeDish.keySet());
    }
    //метод проверки наличия указанного типа блюд в таблице
    boolean checkType(String type) {

        boolean check = false;

        for (String this_type : typeDish.keySet()) {
            if (type.equals(this_type)) {
                check = true;
            }
        }
        return check;
    }
    //метод случайного поиска блюда в списке указаного типа блюд
    String randomDishType(String type) {
        Random random = new Random();
        //ограничение случайного числа в границе от 0 до длины списка блюд
        int randomNumber = random.nextInt(typeDish.get(type).size());
        //вывод случайного блюда
        return typeDish.get(type).get(randomNumber);
    }

}
