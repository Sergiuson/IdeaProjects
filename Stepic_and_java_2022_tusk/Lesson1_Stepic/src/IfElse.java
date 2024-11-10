import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner cush = new Scanner(System.in);
        int summa = cush.nextInt();
        if (summa > 10){
            System.out.println("Пицца");
        } else if (summa <= 10 & summa >= 6){
            System.out.println("Гамбургер");
        } else if (summa < 6 & summa > 0){
            System.out.println("Сэндвитч");
        } else if (summa == 0 | summa < 0){
            System.out.println("Иди работай");
        }
    }
}
