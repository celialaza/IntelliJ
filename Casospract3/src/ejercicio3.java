import java.util.Scanner;

public class ejercicio3 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sueldobase;
    String nombre;
    System.out.print("Escribe el nombre: ");
    nombre = sc.nextLine();
    System.out.print("Escribe el sueldo base: ");
    sueldobase = sc.nextInt();
    double porcentaje;
    porcentaje = sueldobase * 80/100;
    System.out.print("El sueldo líquido es: "+(sueldobase - porcentaje));
   sc.close();
    }
}