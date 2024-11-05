import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe A: ");
        int A = sc.nextInt();
        System.out.println("Escribe B: ");
        int B = sc.nextInt();
        int x;
        x = A;
        A = B;
        B = x;

        System.out.println("El valor de A es: "+A+" El valor de B es: "+B);
}

}