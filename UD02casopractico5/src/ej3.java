import java.util.Scanner;

public class ej3 {
    //Calcular el Cuadrado y el Cubo de los 5 primeros números enteros que siguen a uno escrito por teclado
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int num = sc.nextInt();

        for(int x= num; x<=6; x++){
            int cuadrado=0;
            int cubo=0;
            cuadrado = num*num;
            cubo=num*num*num;
            System.out.println("El cuadrado de "+num+ " es: "+cuadrado+ " y el cubo es: "+cubo);
            num++;

        }

        }

}
