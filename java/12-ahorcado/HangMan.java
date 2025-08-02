import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangMan {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> steps = List.of("""
                  +---+
                  |   |
                      |
                      |
                      |
                      |
                =========""","""
                  +---+
                  |   |
                  O   |
                      |
                      |
                      |
                =========""","""
                  +---+
                  |   |
                  O   |
                 /    |
                      |
                      |
                =========""","""
                  +---+
                  |   |
                  O   |
                 /|   |
                      |
                      |
                =========""","""
                  +---+
                  |   |
                  O   |
                 /|\\  |
                      |
                      |
                =========""","""
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 /    |
                      |
                =========""","""
                  +---+
                  |   |
                  O   |
                 /|\\  |
                 / \\  |
                      |
                =========""");

        Scanner words = new Scanner(new File("path/hasta/tu/fichero/words.txt"));
        Random random = new Random();

        Set<Character> guessed = new HashSet<>();
        Set<Character> notContains = new HashSet<>();

        List<String> guessingWords = new ArrayList<>();
        while (words.hasNext()) {
            guessingWords.add(words.nextLine());
        }

        String word = guessingWords.get(random.nextInt(guessingWords.size()));

        Scanner keyboard = new Scanner(System.in);
        int tries = 0;
        char guess;
        boolean win = false;
        boolean lose = false;

        do {
            System.out.println("Introduce letra... ");
            guess = keyboard.nextLine().charAt(0);

            if (notContains.contains(guess)) {
                System.out.println("Ya has probado con esa letra... ");
            } else if (word.indexOf(guess) >= 0) {
                guessed.add(guess);
                System.out.println("La letra " + guess + " estaba");

                win = true;
                for (char c : word.toCharArray()) {
                    if (!guessed.contains(c)) {
                        win = false;
                        break;
                    }
                }
            } else {
                System.out.println("La letra " + guess + " NO estaba");
                tries++;
                notContains.add(guess);
            }

            for (char c : word.toCharArray()) {
                if (guessed.contains(c)) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("_ ");
                }
            }

            if (win) {
                System.out.println("Has ganado!!");
            } else {
                System.out.println("Letras hasta ahora: " + notContains);
                System.out.println(steps.get(tries));
                if (tries == steps.size() - 1) {
                    lose = true;
                    System.out.println("Juego terminado. Palabra " + word + " NO acertada");
                }
            }

        } while(!lose && !win);

    }
}
