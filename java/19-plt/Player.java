public abstract class Player {
    private String nombre;

    public Player(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Move elegirMovimiento();
}