public class ejercicio5 {
    public static void main(String[] args){
        int contador = 0;
        for (int  num = 1; num <= 100; num ++) {
            if(num%2==0 || num%3==0){
                System.out.println(num);
                contador++;
            }
        }
        System.out.println("Hay "+contador+" múltiplos de 2 0 3 entre el 1 y el 100");
    }
}
