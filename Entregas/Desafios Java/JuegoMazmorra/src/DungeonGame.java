import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String jugadorNombre = sc.nextLine();
        Jugador jugador = new Jugador(jugadorNombre, 100);

        Room[] dungeon = {
            new VRoom(),
            new TRoom(new Tesoro("Varita magica")),
            new ERoom(20),
            new TRoom(new Tesoro("Libro de hechizos")),
            new VRoom(),
            new ERoom(30)
        };

        for (Room room : dungeon) {
            if (jugador.getPH() <= 0) {
                System.out.println("Sin puntos de vida. Game over.");
                break;
            }
            System.out.println("Puedes continuar a otra habitacion. Presiona enter para continuar.");
            sc.nextLine();
            room.enter(jugador);
            jugador.showStatus();
        }

        if (jugador.getPH() > 0) {
            System.out.println("Felicitaciones has explorado todas las habitaciones.");
        }

        sc.close();
    }
}