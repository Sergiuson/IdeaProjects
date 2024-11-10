public class Rect {

        double leght;
        double width;
        double square;

        void getSides(double leght, double width){
            this.leght = leght;
            this.width = width;
            this.square = this.leght * this.width;
        }



        void getSquare1(){
            System.out.println("Square = " + "leght(" + leght + ")" + " + "+ "width(" + width + ")" + " = " + square);
        }

        double getSquare2(){
            return leght * width;
        }
        void getSquare3(){
        System.out.println("Square = " + "leght(" + leght + ")" + " + "+ "width(" + width + ")" + " = " + getSquare2());
        }

}
