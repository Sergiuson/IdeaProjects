public class Arravi1 {
    public static void main(String[] args) {
        int[] a = {1,2,45,39,29,50,0,200,-1,3,2};
        int f;
        int g;
        for (int i = 0; i <= a.length - 1; i++){
            //System.out.println("i = " + i);
            for (int c = i; c <= a.length - 2; c++){
                //System.out.println("c = " + c);
                f = a[i];
                g = a[c + 1];
                if (a[i] < a[c + 1]){
                    a[i] = g;
                    a[c + 1] = f;
                }


            }

        }
        for (int j = 0; j <= a.length - 1; j++) {
            System.out.println(a[j] );
        }

    }
}
