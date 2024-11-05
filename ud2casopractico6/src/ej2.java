import java.util.Scanner;
public class ej2 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int num;
        do{
        System.out.println("Escribe un número que esté entre el 1 y el mil: ");
        num=sc.nextInt();
        } while(num<1||num>1000); //Pedirá el número tantas veces hasta que esté dentro del rango
        if(num==1000){
        System.out.print("M");
        num=num-1000;
        }
        if(num>=900 && num<=999){
        System.out.print("CM");
        num = num-900;
        }
        if(num>=500 && num<=899){
        System.out.print("D");
        num= num-500;
        }
        if(num>=400 && num<=499){
        System.out.print("CD");
        num= num-400;
        }
        if(num>=300 && num<=399){
        System.out.print("CCC");
        num= num-300;
        }
        if(num>=200 && num<=299){
        System.out.print("CC");
        num= num-200;
        }
        if(num>=100 && num<=199){
        System.out.print("C");
        num= num-100;
        }
        if(num>=90 && num<=99){
        System.out.print("XC");
        num= num-90;
        }
        if(num>=50 && num<=89){
        System.out.print("L");
        num= num-50;
        }
        if(num>=40 && num<=49){
        System.out.print("XL");
        num= num-40;
        }
        if(num>=30 && num<=39){
        System.out.print("XXX");
        num= num-30;
        }
        if(num>=20 && num <=29){
        System.out.print("XX");
        num= num-20;
        }
        if(num>=10 && num<=19){
        System.out.print("X");
        num= num-10;
        }
        if(num==9){
        System.out.print("IX");
        num= num-9;
        }
        if(num>=5 && num<=8){
            System.out.print("V");
        num= num-5;
        }
        if(num==4){
        System.out.print("IV");
        num= num-4;
        }
        if(num==3){
        System.out.print("III");
        num= num-3;
        }
        if(num==2){
        System.out.print("II");
        num= num-2;
        }
        if(num==1){
        System.out.print("I");
        num= num-1;
        }

    }

}
