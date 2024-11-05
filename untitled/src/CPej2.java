import java.util.Scanner;

public class CPej2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        System.out.println("Escribe el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Escribe el valor de la altura: ");
        altura = sc.nextDouble();
        double area;
        area = base*altura/2;
        System.out.println("El área es: "+area);
        sc.close();

}
}

