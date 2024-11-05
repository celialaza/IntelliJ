import java.util.Random;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

            Random r=new Random();
            int aleatorio=r.nextInt(6)+1;
            int aleatorio2= r.nextInt(6)+1;
            int suma=aleatorio+aleatorio2;
            int intento=0;
            System.out.println(+suma);

            System.out.println("¿Cuántas intentos necesitas para adivinar la suma de los dos dados? ");
            int intentos= sc. nextInt();

            do{
                for(int i=1; i<=intentos; i++){
        System.out.println("intento número: "+i);
        intento=sc.nextInt();
        if(intento==suma)
            System.out.println("Acertaste");
        else if(intento>suma)
            System.out.println("La suma es menor");
        else
            System.out.println("La suma es mayor");
            }

            }while(intento==suma);
        System.out.println("El número era: "+suma+ " Los número eran: "+aleatorio+", "+aleatorio2);
    }

}

