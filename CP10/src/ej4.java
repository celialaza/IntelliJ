import java.util.Random;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        int rango= 2;
        int contjug = 0;
        int contpc=0;

do{
        System.out.println("Elige tu arma:" + " Piedra = 0" + " Tijera= 1" + " Papel = 2");
        int arma=sc.nextInt();
        int aleatorio=r.nextInt(rango);

        if(arma==aleatorio){
            System.out.println("empate");
        }
         if(arma==0 && aleatorio==1){
                System.out.println("piedra vs tijera = jugador +1");
                contjug ++;
                System.out.println("JUDADOR= "+contjug+" PC= "+contpc);
            }
         if(arma==1 && aleatorio==2){
                System.out.println("tijera vs papel = jugador +1");
                contjug ++;
                System.out.println("JUDADOR= "+contjug+" PC= "+contpc);
            }
         if(arma==2 && aleatorio==0){
                System.out.println("papel vs piedra = jugador +1");
                contjug ++;
                System.out.println("JUDADOR= "+contjug+" PC= "+contpc);
            }
         if(arma==1 && aleatorio==0){
                System.out.println("tijera vs piedra = PC +1");
                contpc++;
                System.out.println("JUDADOR= "+contjug+" PC= "+contpc);
            }
         if(arma==2 && aleatorio==1){
                System.out.println("papel vs tijera = PC +1");
                contpc++;
                System.out.println("JUDADOR= "+contjug+" PC= "+contpc);
            }
         if(arma==0 && aleatorio==2){
                System.out.println("piedra vs papel = PC +1 ");
                contpc++;
                System.out.println("JUDADOR= "+contjug+" PC= "+contpc);
            }


        }while( contjug<3 && contpc<3);

if(contjug>=3)
        System.out.println("Has ganado");
else
        System.out.println("Has perdido");
}
    }

