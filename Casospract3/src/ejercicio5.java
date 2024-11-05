import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalalumnos;
        System.out.println("Cuántos alumnos hay: ");
        totalalumnos = sc.nextInt();

        double nota = 0;
        double suma = 0;
        while(nota <= totalalumnos){
            System.out.println("nota alumnos: ");
            nota= sc.nextDouble();
            suma= suma + nota;
            nota++;
        }
        //System.out.println(+suma);
        double media;
        media = suma/totalalumnos;
        System.out.println("La media de todos los alumnos es: "+media);


    }
}
