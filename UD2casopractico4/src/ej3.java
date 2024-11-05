import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        int suma = 0;
        int cont = 0;
        for (int n = 20; n <=3500 ; n++) {

            if((n*(n+1)/2)%7 == 0 ){
                cont++;

                suma = suma+cont;
            }
        }
        System.out.println("Total de la suma: "+suma+"Total números que cumplen la condición: "+cont);
        }
}
