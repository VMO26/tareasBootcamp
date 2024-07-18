public class ERoom implements Room {
    private int damage;

    public ERoom(int damage) {
        this.damage = damage;
    }
    @Override
    public void enter(Jugador jugador) {
        System.out.println("¡Un enemigo te ataca!");
        jugador.daño(damage);
        System.out.println("Has recibido " + damage + " puntos de daño.");
    }
}