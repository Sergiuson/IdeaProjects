import java.util.Scanner;
public class FloatDouble {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please write age Father: ");
        int age_father = console.nextInt();
        System.out.println("Please write age Mother: ");
        int age_mother = console.nextInt();
        System.out.println("Please write age Brother: ");
        int age_brother = console.nextInt();
        System.out.println("Please write age You: ");
        int age_you = console.nextInt();
        float age_family = ((float)(age_father+age_mother+age_brother+age_you)/4);
        System.out.println("Age family = " + age_family);
    }
}
