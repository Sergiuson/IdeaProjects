public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster( int eyes, int hands, int legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    Monster(int count){
        this(count, count, count);
    }
    Monster(){
        this(2);
    }
    void showMonster(){
        System.out.println("Moster is :" + "\neyes = " + eyes + "\nhands = " + hands + "\nlegs = " + legs);
    }
    void voice(int c, String words){
        System.out.println("Output:");
        for(int i = 1; i <= c; i++){
            System.out.println("\n" + words);
        }
    }
    void voice(int c){
        this.voice(c,"Grrrr");
    }
    void voice(){
        this.voice(1);
    }
}
