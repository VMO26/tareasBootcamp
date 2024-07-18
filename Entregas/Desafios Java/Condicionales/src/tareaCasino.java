import java.util.Scanner;

public class tareaCasino {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Apuestas Apuesta Feliz. Por favor, proporcione la siguiente información para registrarse.");
        System.out.println("¿Cuál es su nombre?");
        Scanner nom = new Scanner(System.in);
        String nombre = nom.nextLine();

        System.out.println(nombre + ", por favor, indique su edad:");
        int edad;
        try {
            Scanner sc = new Scanner(System.in);
            edad = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Ingrese una edad válida.");
            return;
        }
        if (edad >= 18) {
            System.out.println("¡Gracias! A continuación, ingrese el monto para su saldo inicial:");

            int saldoInicial;
            try {
                Scanner sc = new Scanner(System.in);
                saldoInicial = sc.nextInt();
                sc.close();
            } catch (Exception e) {
                System.out.println("Error: Ingrese un monto válido para el saldo inicial.");
                return;
            }
            if (saldoInicial >= 50) {
                System.out.println("¡Felicidades, ha completado su registro! Su saldo inicial es de $" + saldoInicial);
            } else {
                System.out.println("Error: El monto mínimo para el saldo inicial es de $50. Vuelve cuando tengas suficiente dinero.");
            }
        } else {
            int dif = 18 - edad;
            System.out.println("Lo siento, eres menor de edad. Debes esperar " + dif + " años para apostar.");
        }
        nom.close();
    }
}

