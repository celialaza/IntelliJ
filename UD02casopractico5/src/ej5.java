import java.util.Scanner;

public class ej5 {
    //%de niños y de niñas en un curso
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos hay?: ");
        int niños=sc.nextInt();
        System.out.println("¿Cuántas alumnas hay: ?");
        int niñas=sc.nextInt();
        int total=niños+niñas;
        sc.close();
        System.out.println("El porcentaje de alumnos es: "+((niños*100)/total));
        System.out.println("El porcentaje de alumnas es: "+((niñas*100)/total));
}
}
