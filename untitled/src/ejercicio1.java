public class ejercicio1 {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        num1 = 4;
        num2 = 2;
        num3 = 0;

        if (num1>num2 && num1>num3){
            System.out.println("num1 es el mayor");

        } else if (num2>num1 && num2>num3){
            System.out.println("num2 es el mayor");
        }else{
            System.out.println("num3 es el mayor");
        }
    }
}
