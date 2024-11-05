import java.util.Scanner;

public class ej5 {
    //Lea una secuencia de una serie de númneros positivos terminada con la introducción de un 0. Obtenga e imprima el mayor de todos.
    //Si se introduce uno negativo, imprima un mensaje.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int mayor;

        for( int x = 1; x != 0; x ++){
        System.out.println("Escribe un número: ");
        y = sc.nextInt();
            mayor = x -1;
            if (y > mayor){
                int res = y;
                System.out.println("EL número mayor es: "+res);
        if( y < 0){
                System.out.println("El número es negativo, no sirve.");

            }
        else if( y == 0){
            System.out.println("Termina");
            break;
        }

        }
}

        }
    }

    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int mayor=-1;

        do{
        System.out.println("Escribe un número: ");
        y = sc.nextInt();
           if( y < 0){
                System.out.println("El número es negativo, no sirve.");

           else if (y > mayor){
             mayor = y;
                System.out.println("EL número mayor es: "+res);

}
            }while (y!=0);
            sc.close();

             System.out.println("EL número mayor es: "+mayor);*/
/* Solución 2: con blucle while

 Scanner sc = new Scanner(System.in);
        int y;
        int mayor;
        System.out.print("Escribe un número: ");
        y=sc.nextInt();
        mayor = y;
        while(y != 0){
         System.out.println("Escribe un número: ");
        y = sc.nextInt();
           if( y < 0){
                System.out.println("El número es negativo, no sirve.");

           else if (y > mayor){
             mayor = y;
             sc.close();
             }
                System.out.println("EL número mayor es: "+mayor);

 */