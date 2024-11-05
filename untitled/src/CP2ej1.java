import java.util.Scanner;

public class CP2ej1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;
        double peso;
        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();
        System.out.println("Escribe tu peso: ");
        peso = sc.nextDouble();
        System.out.println("Edad:"+edad+ " peso: "+peso+"kg");
        sc.close();


    }
}
