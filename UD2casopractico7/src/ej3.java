import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de alumnos: ");
        int totalalumnos=sc.nextInt();
        int costo=0;
        int costindiv=0;

        if(totalalumnos>=100){
            costo= totalalumnos*65;
            costindiv=65;
        }
        if (totalalumnos>=50 && totalalumnos<=99){
            costo=totalalumnos*70;
            costindiv=70;
        }
        if (totalalumnos>=30 && totalalumnos<=49){
            costo=totalalumnos*95;
            costindiv=95;

        } if (totalalumnos>=1 && totalalumnos<=30){
            costo=3000;
            costindiv=3000/totalalumnos;
}

        System.out.println("el importe final es de : "+costo);
        System.out.println("el importe individual es de : "+costindiv);
        }

    }