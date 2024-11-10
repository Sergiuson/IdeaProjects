
public class Exzample
{
    public static void main(String[] args) {
        String text = "Suka, John is 27? lol";
        String a = text.substring(5,10);
        System.out.println(a);
        String b = text.substring(14,16);
        System.out.println(b);
        int c = Integer.parseInt(b);
        System.out.println(c + 1);
    }
}
