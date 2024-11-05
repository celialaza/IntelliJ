import java.util.Random;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;



        System.out.println("¿Cuántas veces lanzas el dado? ");
         int n= sc. nextInt();


        for(int i=1; i<=n; i++){
            Random r=new Random();
            int aleatorio=r.nextInt(6)+1;
        if( aleatorio == 1)
                cont1++;
        if( aleatorio == 2)
            cont2++;
        if( aleatorio == 3)
            cont3++;
        if( aleatorio == 4)
            cont4++;
        if( aleatorio == 5)
            cont5++;
        if( aleatorio == 6)
            cont6++;
        }

            System.out.println("Ha salido el 1: "+cont1+" veces");
            System.out.println("Ha salido el 2: "+cont2+" veces");
            System.out.println("Ha salido el 3: "+cont3+" veces");
            System.out.println("Ha salido el 4: "+cont4+" veces");
            System.out.println("Ha salido el 5: "+cont5+" veces");
            System.out.println("Ha salido el 6: "+cont6+" veces");

    }
}

