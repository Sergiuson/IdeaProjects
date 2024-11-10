import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int e = console.nextInt();
        int h = console.nextInt();
        int l = console.nextInt();
        Monster m1 = new Monster(e,h,l);
        m1.showMonster();
        int w = console.nextInt();
        String words = console.nextLine();
        m1.voice(w,words);
        int c = console.nextInt();
        Monster m2 = new Monster(c);
        m2.showMonster();
        m2.voice(3);
        Monster m3 = new Monster();
        m3.showMonster();
        m3.voice();

    }
}