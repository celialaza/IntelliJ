import java.sql.SQLOutput;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número A: ");
        int A = sc.nextInt();
        System.out.println("Escribe un número B: ");
        int B = sc.nextInt();

        if( A>B){
        int cont = 0;
        int suma = 0;
        for (int n = 100; n <=1000 ; n++) {
            if((n*(n+1)/2)%5 == 0 ){
                cont++;
                suma = suma+cont;
            }
}
            System.out.println(+suma);
        }
        else if (A==B){
            int res = 0;
            for(int n = 1; n<=45; n= n+4){
                res= n/A +res;
            }
            System.out.println(+res);
        }
        else /*if (A < B)*/{
            double c = 0;
            int exponente = 3;
            for(int x = 2; x<= 20; x=x+2){
                    c = Math.pow(x,exponente)+ c;
                    exponente = exponente +3;
                }
            System.out.println(+(B-A)* c);
            }



        }
    }



