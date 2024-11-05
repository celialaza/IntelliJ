import java.sql.SQLOutput;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un día de la semana: ");
        String dia = sc.nextLine();
        switch(dia.toLowerCase()){
            case "lunes", "martes", "miércoles","miercoles", "jueves", "viernes" -> System.out.println("Es un día laborable");
            case "sábado","sabado", "domingo"->  System.out.println("No es un día laborable");
            default -> System.out.println("El valor introducido no es válido.");
        }

    }
}
//La flechita en el switch en vez de break, es una forma más moderna de expresarlo