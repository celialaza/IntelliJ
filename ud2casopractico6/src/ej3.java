import java.sql.SQLOutput;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        System.out.println("Escribe el lado del triángulo: ");
        lado=sc.nextInt();
        for(int fila= 1; fila<=lado; fila++){
            for(int asteriscos= 1; asteriscos<=fila; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
