import java.util.ArrayList;
import java.util.List;

public class Jugador {
private String nombre;
private int pH;
private List<Object> inventario;

 public Jugador(String nombre, int pH) {
        this.nombre = nombre;
        this.pH = pH;
        this.inventario = new ArrayList<>();
    }

public String getNombre() {
    return nombre;
}

public int getPH() {
    return pH;
}

public void daño(int damage) {
    this.pH -= damage;
}

public void addToInventory(Object item) {
    this.inventario.add(item);
}

public void showStatus() {
    System.out.println("Jugador: " + nombre);
    System.out.println("Puntos de salud: " + pH);
    System.out.println("Inventario: " + inventario.size() + " items");
}
}
