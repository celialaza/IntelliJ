import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int año_nacimiento;
        int año_actual;
        System.out.println("Escribe tu año de nacimiento: ");
        año_nacimiento = sc.nextInt();
        System.out.println("Escribe el año actual: ");
        año_actual = sc.nextInt();

        edad = año_actual - año_nacimiento;
        System.out.println("Tu edad es: "+edad);
}
}

