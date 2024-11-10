public class Arravi2 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i = 0; i <= a.length - 1; i++){
            a[i]= 100 + i;
        }
        for(int c : a){
            System.out.println(c);
        }
    }
}
