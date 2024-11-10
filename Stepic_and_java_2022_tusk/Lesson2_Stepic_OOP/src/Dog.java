public class Dog {
    String name;
    String breed;
    Double weight;
    int speed;

    String getSpecifications(){
        return "Specifications is " + "Name " + name + ", " + "Breed " + breed + ", " + "Weight " + weight;
    }
    void showName(){
        System.out.println("Name :" + name);
    }
    void showSpeed(){
        for (int i = 0; i < speed; i++ ){
            System.out.println("Бегу!!!");
        }
    }
}
