import java.util.Scanner;
public class NextLine {
    public static void main(String[] args){
        Scanner concole = new Scanner(System.in);
        String text = concole.nextLine();
        if(text.equals("yes")){
            System.out.println("a");
        }else {
            System.out.println("NO");
        }

    }
}
