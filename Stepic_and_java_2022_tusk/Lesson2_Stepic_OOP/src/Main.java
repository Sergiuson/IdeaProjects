import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        Dog dog1 = new Dog();

        dog1.name = console.nextLine();
        dog1.breed = console.nextLine();
        dog1.weight = console.nextDouble();
        dog1.speed = console.nextInt();
        System.out.println(dog1.getSpecifications());
        dog1.showSpeed();

    }
}