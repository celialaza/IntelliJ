import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Precio inicial: ");
        int precio = sc.nextInt();
        char tipo;
        char tamaño;
        double tarifa;
        do{
        System.out.println("Tipo de uva: ");
        tipo= sc.next().toLowerCase(). charAt(0);
        }while(tipo != 'a' && tipo != 'b');
        do{
        System.out.println("Tamaño: ");
        tamaño = sc.next().charAt(0);
        }while(tamaño!='1' && tamaño!='2');
        System.out.println("Cantidad: ");
        int cantidad=sc.nextInt();

        if(tipo=='a'){
            if(tamaño=='1')
                tarifa=(precio+0.20)*cantidad;
                else
                tarifa=(precio+0.30)*cantidad;
            }
            else{
            if(tamaño=='1')
                tarifa=(precio-0.30)*cantidad;
            else
                tarifa=(precio-0.50)*cantidad;

        }
        System.out.printf("Precio final: %.2f€",tarifa);

        }
}
