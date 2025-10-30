public class Client {
    public static void main(String[] args) {
        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.add(new AddOrder(1L, 5))
                .add(new AddOrder(2L, 10))
                .add(new ExecuteOrder(1L))
                .add(new ExecuteOrder(2L))
                .add(new AddOrder(3L, 15))
                .process();
    }
}
