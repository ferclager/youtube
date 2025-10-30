public record ExecuteOrder(long id) implements Command {
    @Override
    public void execute() {
        System.out.println("Order " + id + " executed");
    }
}
