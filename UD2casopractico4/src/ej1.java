import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int x = sc.nextInt();
        System.out.println("Escribe un número: ");
        int y = sc.nextInt();
        int solucion;
        if(x == y )
            solucion = x * y;
        else if( x>y)
            solucion = x - y;
            else
            solucion = x + y;

        System.out.println("La solución es: "+solucion);
    }


}
