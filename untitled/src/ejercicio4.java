import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double nota;
    System.out.println("Cuál es la calificación númerica: ");
    nota = sc.nextDouble();

    if (nota <= 0 && nota<4){
            System.out.println("insuficiente");

    }  else if (nota <=4 && nota<6){
            System.out.println("regular");
    }else if (nota<=6 && nota<7){
        System.out.println("bien");
    }   else if (nota<=7 && nota<9){
        System.out.println("notable");
    }else if( nota<= 9 && nota<=10);
        System.out.println("sobresaliente");
        sc.close();
    }
    }





