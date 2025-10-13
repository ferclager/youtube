import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player jugador1 = new HumanPlayer("Fer", scanner);
        Player jugador2 = new ComputerPlayer("Ordenador");

        Game juego = new Game(jugador1, jugador2);
        char sigue;
        do {
            juego.jugarUnaRonda();
            System.out.println("Otra vez? [s/n]");
            sigue = scanner.nextLine().charAt(0);
        } while (sigue != 'n');
        scanner.close();
    }
}