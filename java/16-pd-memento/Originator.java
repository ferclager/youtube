public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento create() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
