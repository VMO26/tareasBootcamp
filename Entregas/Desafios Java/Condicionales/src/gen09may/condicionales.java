package gen09may;
import java.util.Random;

public class condicionales {
    public static void main(String [] args) {

        String eleccionU;
        String eleccionC;

        Scaner sc = new Scaner(System.in);

        Random rand = new Random();
        int numrand = rand.nextInt(3) + 1;
        // int numero  = (int) (Math.random()*4)+1;
        //System.out.println (numrand);
        //para crear un numero aletorio entre 1 y 3 y jugar al cachipun con la computadora

        if (numrand == 1){
            eleccionC = "Piedra";
        } else if (numrand==2) {
            eleccionC = "Papel"
        } else {
            eleccionC = "Tijera"
        }
        System.out.println("Bienvenido al juego de PIEDRA-PAPEL-TIJERA");
        System.out.println("Introduce una opción: 1.- Jugar 0.- Salir");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("Escribe cual opcción jugarás PIEDRA-PAPEL-TIJERA");
            eleccion = sc.next();
            System.out.println ("Elegiste: " + eleccion);
            System.out.println("La computadora eligió: "+ eleccionDeComputador);

            if ((eleccion.equalsIgnoreCase("piedra")&& eleccionDeComputador.equalsIgnoreCase("papel")) ||
                    (eleccion.equalsIgnoreCase("papel")&& eleccionDeComputador.equalsIgnoreCase("tijera")) ||
                    (eleccion.equalsIgnoreCase("tijera")&& eleccionDeComputador.equalsIgnoreCase("piedra"))){
                System.out.println("Computadora gana la partida");
            }

            else if ((eleccion.equalsIgnoreCase("papel")&&eleccionDeComputador.equalsIgnoreCase("piedra"))||
                    (eleccion.equalsIgnoreCase("tijera")&& eleccionDeComputador.equalsIgnoreCase("papel"))||
                    (eleccion.equalsIgnoreCase("piedra")&& eleccionDeComputador.equalsIgnoreCase("tijera"))) {
                System.out.println("Felicidades! Ganaste la partida");
            } else if (eleccion.equalsIgnoreCase(eleccionDeComputador)){
                System.out.println("Empataron");
            }
        }else{
            System.out.println("Saliste del juego");
    }
    }
