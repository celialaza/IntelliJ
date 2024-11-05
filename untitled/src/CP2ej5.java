import java.util.Scanner;

public class CP2ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        double importe;
        System.out.println("Escribe el mes: ");
        mes = sc.nextInt();
        System.out.println("Escribe el importe: ");
        importe = sc.nextDouble();
// Si detrás del if o del else solo hay una instrucción no hace falta meter llaves.
        if (mes > 0 && mes <= 12) {
            if (mes == 10) {
                double res;
                double descuento;
                descuento = importe * 15 / 100;
                res = importe - descuento;
                System.out.println("El importe es: "+res);
            }else{
                System.out.println("El importe es: "+importe);
            }
sc.close();
        }
    }
}




