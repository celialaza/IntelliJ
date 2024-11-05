import java.util.Scanner;

public class CPej3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Escribe el valor del radio: ");
        radio = sc.nextDouble();
        double area;
        area = Math.PI*radio*radio;
        System.out.println("El área es: "+area);
        sc.close();
}
}

