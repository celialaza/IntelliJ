import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hamb;
        do{
        System.out.println("De qué tipo quieres: ? ");
            hamb = sc.nextInt();
        }while(hamb<1 || hamb>3);

        //senc=1; dob=2, tri=3

        int precio;

        System.out.println("¿Cuántas hamburguesas?: ");
        int num = sc.nextInt();
        if(hamb==1)
            precio= num*5;
        else if(hamb==2)
            precio= num*8;
        else
            precio=num*12;
        System.out.println("El precio en efectivo es de: "+precio+ " pero si pagas con tarjeta sale a: "+((precio*0.05)+precio));
    }

}
