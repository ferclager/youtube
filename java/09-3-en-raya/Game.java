import java.util.*;

public class Game {
    public static void main(String[] args) {

        Set<Integer> playerPositions = new HashSet<>();
        Set<Integer> laptopPositions = new HashSet<>();

        char [][] gameBoard = {
                {' ', '|' , ' ', '|' , ' '},
                {'-', '+' , '-', '+' , '-'},
                {' ', '|' , ' ', '|' , ' '},
                {'-', '+' , '-', '+' , '-'},
                {' ', '|' , ' ', '|' , ' '}
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int playerPos;
        int laptopPos;
        String result;

        while (true) {
            do {
                System.out.println("Elige una posición (1-9)");
                playerPos = scanner.nextInt();
            } while (playerPos > 9 || playerPos < 0 ||
                    playerPositions.contains(playerPos) || laptopPositions.contains(playerPos));
            placePiece(playerPos, gameBoard, 'X', playerPositions);
            System.out.println("Tu movimiento");
            printGameBoard(gameBoard);
            result = checkWinner(playerPositions, laptopPositions);
            if (!result.isEmpty()) {
                System.out.println("Resultado: " + result);
                break;
            }

            do {
                laptopPos = random.nextInt(9) + 1;
            } while (playerPositions.contains(laptopPos) || laptopPositions.contains(laptopPos));
            placePiece(laptopPos, gameBoard, 'O', laptopPositions);
            System.out.println("Su movimiento");
            printGameBoard(gameBoard);
            result = checkWinner(playerPositions, laptopPositions);
            if (!result.isEmpty()) {
                System.out.println("Resultado: " + result);
                break;
            }
        }

        scanner.close();
    }

    private static String checkWinner(Set<Integer> player, Set<Integer> laptop) {
        List<Integer> topRow = List.of(1, 2, 3);
        List<Integer> middleRow = List.of(4, 5, 6);
        List<Integer> bottomRow = List.of(7, 8, 9);
        List<Integer> leftCol = List.of(1, 4, 7);
        List<Integer> middleCol = List.of(2, 5, 8);
        List<Integer> rightCol = List.of(3, 6, 9);
        List<Integer> cross1 = List.of(1, 5, 9);
        List<Integer> cross2 = List.of(3, 5, 7);

        Set<List> winning = new HashSet<>();
        winning.add(topRow);
        winning.add(bottomRow);
        winning.add(middleRow);
        winning.add(middleCol);
        winning.add(leftCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (player.containsAll(l)) {
                return "Has ganado! :)";
            } else if (laptop.containsAll(l)) {
                return "Has perdido :(";
            } else if (player.size() + laptop.size() == 9) {
                return "Empate";
            }
        }

        return "";
    }

    private static void placePiece(int pos, char[][] gameBoard, char symbol, Set<Integer> positions) {
        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                positions.add(pos);
                break;
            case 2:
                gameBoard[0][2] = symbol;
                positions.add(pos);
                break;
            case 3:
                gameBoard[0][4] = symbol;
                positions.add(pos);
                break;
            case 4:
                gameBoard[2][0] = symbol;
                positions.add(pos);
                break;
            case 5:
                gameBoard[2][2] = symbol;
                positions.add(pos);
                break;
            case 6:
                gameBoard[2][4] = symbol;
                positions.add(pos);
                break;
            case 7:
                gameBoard[4][0] = symbol;
                positions.add(pos);
                break;
            case 8:
                gameBoard[4][2] = symbol;
                positions.add(pos);
                break;
            case 9:
                gameBoard[4][4] = symbol;
                positions.add(pos);
                break;
            default:
                break;
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

