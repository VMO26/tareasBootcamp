import java.util.Scanner;

public class Evaluador {

        public static void main(String[] args) {
            System.out.println("Ingrese promedio historia");
            Scanner sc = new Scanner(System.in);
            int evh = Integer.parseInt(sc.nextLine());   // int ev1 = sc.nextLine(); ¿Por que me pide transformarlo a objeto?

            System.out.println("Ingrese promedio matematicas");
            int evm = Integer.parseInt(sc.nextLine());


            System.out.println("Ingrese promedio filosofia");
            int evf = Integer.parseInt(sc.nextLine());


            System.out.println("Ingrese promedio lenguaje");
            int evl = Integer.parseInt(sc.nextLine());

            sc.close();

            System.out.println("Promedio historia " + evh + " su promedio de matematicas es " + evm + " su promedio de filosofía es " + evf + " y su promedio de lenguaje es " + evl);
            int promedioFinal;
            promedioFinal = (evh + evm + evf + evl)/4;
            System.out.println("Por lo tanto su promedio es " + promedioFinal);
// "No Aprobado" si la calificación es 3 o menos.
//"Insuficiente" si la calificación es mayor que 3 pero menor o igual a 5.
//"Aceptable" si la calificación es mayor que 5 pero menor o igual a 8.
//"Excelente" si la calificación es 10.
            if (promedioFinal <= 3) {
                System.out.println("No has aprobado");
            }else if (promedioFinal > 3 && promedioFinal <= 5) {
                System.out.println("Insuficiente");
            } else if (promedioFinal > 5 && promedioFinal <= 9) {
                System.out.println("Aceptable");
            }else if (promedioFinal == 10){
                System.out.println("Exelente nota máxima");
            }else{
                System.out.println("Ha ocurrido un error, revisa los valores ingresados");
            }

        }
    }