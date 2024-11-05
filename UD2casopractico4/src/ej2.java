import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int pares = 0;
        int impares= 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Escribe un número: ");
            num = sc.nextInt();
            if(num != 0){
            if( num%2== 0 )
                pares ++;
            else /*if(num%2!=0)*/
                impares++;
            if(num>= 0)
                positivos++;
            else /*if (num < 0)*/
                negativos++;
        }

        }
        System.out.println("números pares: "+pares+" números impares: "+impares+" números positivos: "+positivos+" números negativos: "+negativos);

    }
}


