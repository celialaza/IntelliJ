import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num = sc.nextInt();
        int copia = num;
        String resultado = "";
        int resto;

        while (num > 0) {
            resto = num % 2;
            resultado = resto + resultado;
            num = num / 2;
        }
        System.out.print("El número" + copia + " en binario es" + resultado);

        copia = num;
        resultado = "";
        while (num > 0) {
            resto = num % 8;
            resultado = resto + resultado;
            num = num / 8;
        }
        System.out.print("El número" + copia + " en octal es" + resultado);

        while (num > 0) {
            resto = num % 16;
            resultado = resto + resultado;
            num = num / 16;
            switch (resto) {
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> resultado=num%16
                case 10 -> resultado + "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
            }

        }
    }
}
        System.out.print(resultado);
                }