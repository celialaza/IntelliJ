import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int talla;
        double A;
        double B;
        double precio;
        int pantalones;
        double mano;
        double preciotot;

        System.out.println("¿cuál es le precio de la tela por metro cuadrado?: ");
        precio=sc.nextDouble();
        System.out.println("Modelo: ");
        //1=A,2=B
        int modelo=sc.nextInt();
        if(modelo==1){
            A= precio*1.5;
            mano= (A * 0.8) + A;
        }else{
            B=precio*1.8;
            mano=(B*0.95) +B;
        }
        do{
        System.out.println("¿Talla?: ");
        talla=sc.nextInt();
        }while(talla != 32 && talla != 30 && talla != 36 );
        //!(talla==30 || talla=32 || talla=36)
        if(talla==32 || talla==36){
            preciotot= (mano*0.04)+mano;
        }else{
            preciotot=mano;
        }
        System.out.println("¿cuántos pantalones?: ");
        pantalones=sc.nextInt();
        preciotot=preciotot*pantalones;
        double ganancia=(preciotot*0.3);
        preciotot=preciotot+ganancia;
        System.out.println("Precio final con carga del 30%: "+preciotot+" Las ganancias de la tienda son: "+ganancia);
    }
}
