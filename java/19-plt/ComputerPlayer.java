public class ComputerPlayer extends Player {
    public ComputerPlayer(String nombre) {
        super(nombre);
    }

    @Override
    public Move elegirMovimiento() {
        Move[] moves = Move.values();
        int idx = (int) (Math.random() * moves.length);
        return moves[idx];
    }
}