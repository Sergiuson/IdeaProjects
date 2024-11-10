import java.util.Scanner;
import java.util.ArrayList;

public class ArraviList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        int j = console.nextInt();

        for (int i = 0; i < j; i++){
            int b = console.nextInt();
            numbers.add(b);

        }
        for(int number : numbers){
            System.out.println(number);
        }
        System.out.println("numbers size :" + numbers.size());
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Please: Write name. If you want stop. Write end");

        String name;

        name = console.nextLine();

        while(name.equals("end")) {



            if(name != "end"){
                names.add(name);
                name = console.nextLine();
            }
            if (name.equals("end")) {
                System.out.println(name);
                break;
            }

        }
        System.out.println("names size :" + names.size());
        int f = 0;
        int s;
        String a;
        for(String n : names){
            System.out.println(n);
        }
        System.out.println("Names - Numbers:");
        if(names.size() > numbers.size()){
             f = names.size();
        }
        else {
            f= numbers.size();
        }

        ArrayList<String> names_numbers = new ArrayList<>();

        for(int g = 0; g < f - 1; g++){
            System.out.println(g);
            if(g < names.size()){
                a = names.get(g);
                System.out.println("name :" + names.get(g));
            }
            else{
                a = null;
            }
            if(g < numbers.size()){
                f = numbers.get(g);
                System.out.println("number :" + numbers.get(g));
            }
            else{
                f = -1;
            }
            names_numbers.add(g, a + " - " + Integer.toString(f));
        }

        for(String e: names_numbers){
            System.out.println(e);
        }
    }
}
