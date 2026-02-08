public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.printf("%-10s sends: %s%n", name, message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.printf("%-10s receives: %s%n", name, message);
    }
}
