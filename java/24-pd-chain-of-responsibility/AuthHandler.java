public class AuthHandler implements HandlerChain {
    private final String token;
    private HandlerChain next;

    public AuthHandler(String token) {
        this.token = token;
    }

    public void setNext(HandlerChain next) {
        this.next = next;
    }

    @Override
    public String addHandler(String input) {
        String output = input + "|\nAuth: " + token;
        if (next == null) {
            return output;
        } else {
            return next.addHandler(output);
        }
    }
}
