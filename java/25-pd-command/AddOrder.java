public record AddOrder(long id, double price) implements Command {
    @Override
    public void execute() {
        System.out.println("Order " + id + " with price " + price);
    }
}
