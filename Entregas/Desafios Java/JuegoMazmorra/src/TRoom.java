public class TRoom implements Room {
    private Object tesoro;

    public TRoom (Object tesoro) {
        this.tesoro = tesoro;
    }

    @Override
    public void enter(Jugador jugador) {
        System.out.println("¡Has encontrado un tesoro!");
        tesoro.interactuar(jugador);
    }
}