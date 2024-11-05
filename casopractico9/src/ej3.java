import java.sql.SQLOutput;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String respuesta;
        double precio;
        double suma=0;
        double preciof;
        do{
        System.out.println("Precio artículo: ");
        precio= sc.nextInt();
            if(precio>=200)
                preciof= precio-(precio*0.15);
            else if(precio>100 && precio<200)
                preciof=precio-(precio*0.12);
            else
                preciof=precio-(precio*0.1);
            System.out.println("costo: "+precio+" Descuento: "+preciof);


        System.out.println("Quieres otro?: ");
        respuesta= sc.next().toLowerCase();
        suma=suma+preciof;

        }while(!(respuesta.equals("no")));
        System.out.println("Costo final: "+suma);





}
        }





