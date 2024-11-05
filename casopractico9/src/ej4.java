import java.util.Scanner;
import java.util.Random;
public class ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        int rango;
        int intento;
        int num=0;

        System.out.println("¿rango de números?: ");
        rango= sc.nextInt();
        System.out.println("Intentos: ");
        intento=sc.nextInt();
        int aleatorio=r.nextInt(rango)+1;
        int i=0;
        do {
            i++;
            System.out.println("intento nº"+i+": Adivina el número: ");
         num=sc.nextInt();
        if(num==aleatorio)
            System.out.println("Lo has adivinado");
        else if(num> aleatorio)
            System.out.println("El número es menor");
        else
            System.out.println("El número es mayor");
        }while (i<intento && num!=aleatorio);

        if(num!=aleatorio)
            System.out.println("Ohh, no lo has adivinado. Has superado el número de intentos. El número era: "+aleatorio);

        }
}
