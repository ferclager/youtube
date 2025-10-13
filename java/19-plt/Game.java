public class Game {
    private Player jugador1;
    private Player jugador2;

    public Game(Player jugador1, Player jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void jugarUnaRonda() {
        Move mov1 = jugador1.elegirMovimiento();
        Move mov2 = jugador2.elegirMovimiento();

        System.out.println(jugador1.getNombre() + " ha elegido: " + mov1);
        System.out.println(jugador2.getNombre() + " ha elegido: " + mov2);

        if (mov1 == mov2) {
            System.out.println("Empate!");
        } else if (mov1.leGanaA(mov2)) {
            System.out.println(jugador1.getNombre() + " gana la ronda.");
        } else {
            System.out.println(jugador2.getNombre() + " gana la ronda.");
        }
    }
}