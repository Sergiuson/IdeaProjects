import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        Double c = console.nextDouble();
        Worker worker1 = new Worker(a,b,c);
        worker1.getIntoWoker();
    }
}