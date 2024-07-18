import java.util.Scanner;


//Disculpe el retraso termine el ejercicio despues de clases y tuve mucho problemas con git bash
public class cineApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int valorBoleto = 3500;
        int boletos;
        int totalBoleta;
        do {
            System.out.println("Bienvenido al cine cinetón, por favor indiquenos su edad para continuar");
            edad = sc.nextInt();
            if (edad < 0 || edad > 120)
                System.out.println("Por favor ingresa una edad valida, mayores de 120 años no son atendidos en nuestras salas");
        }while(edad < 0 || edad > 120);

        if (edad < 5) {
            valorBoleto -= (int) (valorBoleto * 0.6); // con esta operacion si la variable se castea siempre dara 0
            System.out.println("Aplicando descuento para menores de 5 años");
        } else if (edad > 60) {
            valorBoleto -= (int) (valorBoleto * 0.55); // con esta operacion si la variable se castea siempre dara 0
            System.out.println("Aplicando descuento para tercera edad");
        } else {
            System.out.println("Sin descuentos por aplicar, consulte en boleterias por nuestros beneficios");
        }
        System.out.println("El valor de su boleto es $" + valorBoleto + " pesos");
        Scanner blt = new Scanner(System.in);
        do {
            System.out.println("¿Cuantos boleteos desea comprar?");
            boletos = blt.nextInt();
            if (boletos < 0) {
                System.out.println("Listillo! Debes ingresar un numero positvio");
            }
        }while (boletos < 0);
        totalBoleta = (boletos * valorBoleto);
    if (boletos >= 2){
            System.out.println("Desde 2 o más boletos te regalamos un 30% de descuento");
            totalBoleta -= (int) (totalBoleta * 0.3); // con esta operacion si la variable se castea siempre dara 0
    }
    System.out.println("El total de su boleta es $" + totalBoleta + " pesos");
        sc.close();
        blt.close();
    }

}