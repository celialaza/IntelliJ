
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int exponente=2;
        System.out.println("Dimensiones de A: ");
        int A = sc.nextInt();
        System.out.println("Dimensiones de B: ");
        int B = sc.nextInt();
        System.out.println("Dimensiones de C: ");
        int C = sc.nextInt();

        if(Math.pow(A,exponente) + Math.pow(B,exponente) == Math.pow(C,exponente)){
        System.out.println("Es un triángulo rectángulo");
        }
        else if(A==B && A==C){
            System.out.println("El triángulo es equilátero");
        }
        else if(A==B || B==C || A==C ){
            System.out.println("El triángulo es isósceles");
        }
        else{
            System.out.println("El triángulo es escaleno");
        }
    }
}
