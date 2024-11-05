import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio;
        int suma=0;

        System.out.println("Número de cita: ");
        int cita=sc.nextInt();
        for(int i=1; i<=cita; i++){
            if(i>=1 && i<=3){
            precio=150;
        suma=suma+precio;
        }
        if (i>3 && i<=5){
        precio=100;
        suma=suma+precio;
        }
        if (i>5 && i<=8){
        precio=90;
        suma=suma+precio;
        }
        if( i > 8){
            precio=50;
            suma=suma+precio;

                    }
            }
        System.out.println(suma);
                }

}

