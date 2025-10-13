import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char [] plt = {'p','l','t'};
        char player;
        char computer;
        char sigue = 's';

        do {
            computer = plt[random.nextInt(plt.length)];
            System.out.println("Elige... [p]iedra, pape[l] o [t]ijeras");
            player = scanner.nextLine().charAt(0);

            if (player != 'p' && player != 'l' && player != 't') {
                continue;
            }
            System.out.println("El ordenador ha elegido " + computer);

            if (computer == player) {
                System.out.println("Empate!");
            } else {
                if (player == 'p') {
                    if (computer == 't') {
                        System.out.println("Has ganado!");
                    } else {
                        System.out.println("Has perdido :(");
                    }
                } else if (player == 'l') {
                    if (computer == 'p') {
                        System.out.println("Has ganado!");
                    } else {
                        System.out.println("Has perdido :(");
                    }
                } else {
                    if (computer == 'l') {
                        System.out.println("Has ganado!");
                    } else {
                        System.out.println("Has perdido :(");
                    }
                }
            }
            System.out.println("Continuar? [s/n]");
            sigue = scanner.nextLine().charAt(0);
        } while (sigue != 'n');
    }
}