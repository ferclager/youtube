import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String nombre, Scanner scanner) {
        super(nombre);
        this.scanner = scanner;
    }

    @Override
    public Move elegirMovimiento() {
        System.out.print(getNombre() + ", elige... [p]iedra pape[l] [t]ijeras: ");
        while (true) {
            String input = scanner.nextLine();
            Move move = Move.fromString(input);
            if (move != null) {
                return move;
            } else {
                System.out.print("Entrada inválida. Intenta de nuevo: ");
            }
        }
    }
}