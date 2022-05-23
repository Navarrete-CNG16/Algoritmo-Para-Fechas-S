package algoritmo.fecha_mes;
import java.util.Scanner;
public class AlgoritmoFecha_mes {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int d,m,a;
        System.out.println("Introduce el Dia: ");
        d = S.nextInt();
        System.out.println("Introduce el Mes: ");
        m = S.nextInt();
        System.out.println("Introduce el Año: ");
        a = S.nextInt();
        switch(m){
            case 1:
                System.out.println("La fecha es: "+d+"/Enero/"+a);
            break;
            case 2:
                System.out.println("La fecha es: "+d+"/Febrero/"+a);
            break;
            case 3:
                System.out.println("La fecha es: "+d+"/Marzo/"+a);
            break;
            case 4:
                System.out.println("La fecha es: "+d+"/Abril/"+a);
            break;
            case 5:
                System.out.println("La fecha es: "+d+"/Mayo/"+a);
            break;
            case 6:
                System.out.println("La fecha es: "+d+"/Junio/"+a);
            break;
            case 7:
                System.out.println("La fecha es: "+d+"/Julio/"+a);
            break;
            case 8:
                System.out.println("La fecha es: "+d+"/Agosto/"+a);
            break;
            case 9:
                System.out.println("La fecha es: "+d+"/Septiembre/"+a);
            break;
            case 10:
                System.out.println("La fecha es: "+d+"/Octubre/"+a);
            break;
            case 11:
                System.out.println("La fecha es: "+d+"/Noviembre/"+a);
            break;
            case 12:
                System.out.println("La fecha es: "+d+"/Diciembre/"+a);
            break;
            default:
                System.out.println("La fecha introducida esta mal.");
        }
    }
}