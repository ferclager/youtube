public enum Move {
    PIEDRA, PAPEL, TIJERAS;

    public static Move fromString(String input) {
        switch (input.trim().toLowerCase().charAt(0)) {
            case 'p':
                return PIEDRA;
            case 'l':
                return PAPEL;
            case 't':
                return TIJERAS;
            default:
                return null;
        }
    }

    public boolean leGanaA(Move otra) {
        switch (this) {
            case PIEDRA:   return otra == TIJERAS;
            case PAPEL:    return otra == PIEDRA;
            case TIJERAS:  return otra == PAPEL;
            default:       return false;
        }
    }
}