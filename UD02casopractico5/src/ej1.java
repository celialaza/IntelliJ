import java.util.Scanner;
//Dados 10 numeros que se ingresan por teclado, calcular cuantos de ellos osn pares,
// cuantos suiman ellso y el promedio de los impares
public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont= 0;
        int suma= 0;
        int media;
        int cont2= 0;
        int suma2= 0;

        for(int x=1; x <= 10; x++){
            System.out.println("Escribe un número: ");
             int num = sc.nextInt();
             if(num%2==0){
                 suma+= num;
                 cont++;
                 num++;
             }
             else /*if (num%2!=0)*/{
                 suma2+=num;
                 cont2 ++;
                 num++;
             }
        }
        System.out.println("Los números pares son: "+cont);
        System.out.println("la suma de los numeros pares son: "+suma);
        if(cont2<0){
        System.out.println("El promedio de los impares es: "+(media=suma2/cont2));
        }else {
                System.out.println("No se ha escrito ningún número impar");
            }
}
}