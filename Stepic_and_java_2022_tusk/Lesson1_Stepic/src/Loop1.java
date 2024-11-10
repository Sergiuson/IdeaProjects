import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = console.nextInt();
        int limit = console.nextInt();
        while (i <= limit){
            if (i % 2 == 0){
                System.out.println(i);
            }
        i++;
        }
        double j = console.nextDouble();
    }
}
