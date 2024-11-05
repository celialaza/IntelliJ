import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num = sc.nextInt();
        int res;
        int x = 2;
        boolean esPrimo = true;
        while (esPrimo && x < num) {
            res = num % x;
            if (res == 0)
                esPrimo = false;
            x++;
        }
        if (esPrimo)
            System.out.println("El número " + num + " es primo");
        else
            System.out.println("El número " + num + " no es primo");
    }

}

