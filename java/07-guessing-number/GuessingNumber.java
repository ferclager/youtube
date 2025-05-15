import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(1, 101);
        int attempts = 0;
        try ( Scanner scanner = new Scanner(System.in)) {
            int guess = 0;

            System.out.println("Bienvenido al juego de adivinar el número");
            System.out.println("Introduce un número entre 1 y 100");

            while (secret != guess) {
                guess = scanner.nextInt();
                attempts++;
                if (secret == guess) {
                    System.out.println("Has ganado! Has adivinado el numero en " + attempts + " intentos");
                } else if (guess > secret) {
                    System.out.println("Demasiado alto. Intenta otra vez");
                } else {
                    System.out.println("Demasiado bajo. Intenta otra vez");
                }
            }
        }
    }
}
