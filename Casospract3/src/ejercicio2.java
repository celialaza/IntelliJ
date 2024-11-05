import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double neto;

        System.out.println("Escribe el neto de la factura: ");
        neto = sc.nextDouble();
        double iva;
        iva = neto * 21/100;
        System.out.println("El total de la factura es: "+(neto + iva));
//(neto+iva) para ahorrar líneas de código en vez de crear otra variable "total".
       sc.close();
        }
}
