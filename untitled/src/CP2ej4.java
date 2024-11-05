import java.util.Scanner;

public class CP2ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Escribe un valor x: ");
        x = sc.nextDouble();
        System.out.println("Escribe un valor y: ");
        y = sc.nextDouble();
        double res;
        if (x > y) {
            res = x / y;
            System.out.println("El resultado es: " + res);
        } else if (y > x) {
            res = y / x;
            System.out.println("El resultado es: " + res);
        }
        sc.close();
    }

}
