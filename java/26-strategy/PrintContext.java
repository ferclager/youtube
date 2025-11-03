public class PrintContext {
    private final PrintStrategy strategy;

    public PrintContext(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String input) {
        System.out.println(strategy.format(input));
    }
}
