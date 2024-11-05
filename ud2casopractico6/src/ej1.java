import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int menor=0;
        int resmayor = 0;
        int cantidad;
        int pares=0;
        int suma=0;
        System.out.println("¿Cuántos números vas a ingresar?");
        cantidad = sc.nextInt();
        for(int x=1; x<=cantidad; x++){
            System.out.println("Escribe el número"+x+ " :");
            num = sc.nextInt();
           int mayor=x-1;
            if (num> mayor){
                resmayor=num;
                }
            if (num<mayor){
                menor=num;
                }
            if(num%2==0 && num!=0){
                suma+=num;
                pares++;
            }

        }
        System.out.println("El mayor de todos es el: "+resmayor);
        System.out.println("El menor es el: "+menor);
        if(pares>0)
            System.out.println("el promedio de lso pares es: "+(suma/pares));
        else
            System.out.println("No hay ningún número par");
    }

    }



