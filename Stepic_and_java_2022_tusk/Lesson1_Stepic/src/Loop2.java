import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int limit = console.nextInt();
        int min = console.nextInt();
        for (int i = limit; i >= min; i--){
            if ( i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
