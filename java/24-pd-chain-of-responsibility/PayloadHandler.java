public class PayloadHandler implements HandlerChain {
    private final String payload;
    private HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    public void setNext(HandlerChain next) {
        this.next = next;
    }

    @Override
    public String addHandler(String input) {
        String output = input + "|\nBody: " + payload;
        if (next == null) {
            return output;
        } else {
            return next.addHandler(output);
        }
    }
}
