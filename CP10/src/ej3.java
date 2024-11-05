/*import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double intereses = 0;
        double pagoact= 0;
        double res=0;
        System.out.println("Saldo anterior: ");
        int saldoa = sc.nextInt();
        System.out.println("Monto de las compras de este mes: ");
        int monto = sc.nextInt();
        System.out.println("Cantidad de debe de meses anteriores: ");
        int deuda = sc.nextInt();
        System.out.println("Pago depositado: ");
        double pago = sc.nextDouble();

        Double saldoact= saldoa-pago;

        double pagomin=(deuda+monto)*0.15;
        System.out.println("El pago mínimo que debe hacer es: "+pagomin+"€");
        
        //para no generar intereses
        double límite=(deuda+monto)*0.85;
        System.out.println("Para no generar intereses el pago debe ser igual o mayor a: "+límite+"€");
        intereses = límite*0.12;

        if(pago<pagomin){
            res=intereses+200;

            System.out.printf("no se ha alcanzado el pago mínimo por lo que la deuda queda en: %.2f€",res);
        }
        else if(pago<límite){
            res=límite*0.12;
            System.out.println("El pago está por debajo del 85% por lo que se aumenta la deuda en un 12%: "+res+"€");
        }
        System.out.println("Pago que desea realizar este mes: ");
         pagoact = sc.nextDouble();

        System.out.println("Una vez realizado el pago, su saldo actual es: "+(saldoact-pagoact));

        /*if(pagoact<pagomin){
            res=
            System.out.printf("no se ha alcanzado el pago mínimo por lo que la deuda queda en: %.2f€",(intereses+200));
        }
        else if(pagoact<límite){
            System.out.println("El pago está por debajo del 85% por lo que se aumenta la deuda en un 12%: "+intereses+"€");




            }
        }
}*/

