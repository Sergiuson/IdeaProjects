public class Worker {

    String name;
    String dolg;
    double money;

    Worker(String name, String dolg, double money){
        this.name = name;
        this.dolg = dolg;
        this.money = money;
    }

    void getIntoWoker(){
        System.out.println("Name worker is " + name);
        System.out.println("Dolg worker is " + dolg);
        System.out.println("Money worker is " + money);
    }
}
