import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escribe la base y la altura del triángulo: ");
        num=sc.nextInt();
        for(int fila= 1; fila<=num; fila++){
            //pintar espacios
            for(int i=1; i<= (num-fila); i++){
                System.out.print(" ");
            }
            for(int asteriscos= 1; asteriscos<=fila; asteriscos++){
                System.out.print("* ");
                }
                System.out.println();
            }

        }
    }






