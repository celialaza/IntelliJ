import java.sql.SQLOutput;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int euros;
        System.out.println("Escribe la cantidad en euros: ");
        euros=sc.nextInt();
        int cont=0;


           while(euros>=500){
               cont++;
               euros=euros-500;

        } System.out.println("Billetes de 500: "+cont);
           cont=0;
        while(euros>=200 && euros<=499){

            cont++;
            euros=euros-200;

        } System.out.println("Billetes de 200: "+cont);
        cont=0;
        while(euros>=100 && euros<=199){

            cont++;
            euros=euros-100;

} System.out.println("Billetes de 100: "+cont);
        cont=0;
        while(euros>=50 && euros<=99){

            cont++;
            euros=euros-50;

    } System.out.println("Billetes de 50: "+cont);
        cont=0;
        while(euros>=20 && euros<=49){

            cont++;
            euros=euros-20;

}  System.out.println("Billetes de 20: "+cont);
        cont=0;
        while(euros>=10 && euros<=19){

            cont++;
            euros=euros-10;

        }System.out.println("Billetes de 10: "+cont);
        cont=0;
            while(euros>=5 && euros<=9){
                cont++;
                euros=euros-5;

            } System.out.println("Billetes de 5: "+cont);
            cont=0;
                while(euros>=2 && euros<=4){
                    cont++;
                    euros=euros-2;

                }System.out.println("monedas de 2: "+cont);
                cont=0;
                    while(euros==1 ){
                        cont++;
                        euros=euros-1;

                    } System.out.println("monedas de 1: "+cont);

    }
    }
