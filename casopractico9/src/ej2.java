import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hora;
        String turno;
        String día;
        double tarifa;
        double tarifaf=0;
        do{
            System.out.println("Cuántas horas: ?");
            hora= sc.nextInt();
        }while (!(hora>0 && hora<=24));
        do{
            System.out.println("Qué turno: ?");
            turno= sc.next().toLowerCase();
        }while (!(turno.equals ("diurno") || turno.equals("nocturno")));
        do{
            System.out.println("Día: ");
            día= sc.next().toLowerCase();
        }while (!(día.equals ("festivo") || día.equals("laborable")));

        if(turno.equals("diurno")){
            tarifa=10*hora;
        }else{
            tarifa=13.5*hora;
        }
        if(día.equals("festivo")){
            if(turno.equals("diurno"))
            tarifaf=(tarifa*0.1)+tarifa;
            else
            tarifaf=(tarifa*0.15)+tarifa;
            System.out.println("El sueldo del trabajor es: "+tarifaf);
        }
        if(día.equals("laborable"))
            System.out.println("El sueldo del trabajador es: "+tarifa);

}

}

