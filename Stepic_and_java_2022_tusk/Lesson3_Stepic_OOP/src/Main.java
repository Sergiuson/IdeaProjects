import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        Rect rect1 = new Rect();
         rect1.getSides( a , b);
         rect1.getSquare1();
         rect1.getSquare3();
        String text = console.nextLine();
        boolean a = text.equals("a");
    }
}