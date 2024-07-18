public class Tesoro implements Object {
    private String nombre;

    public Tesoro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void interactuar(Jugador jugador) {
        System.out.println("Nuevo objeto en el inventario: " + nombre);
        jugador.addToInventory(this);
    }

    @Override
    public String toString() {
        return nombre;
    }
}