public class ContentTypeHandler implements HandlerChain {
    private final String type;
    private HandlerChain next;

    public ContentTypeHandler(String type) {
        this.type = type;
    }

    public void setNext(HandlerChain next) {
        this.next = next;
    }

    @Override
    public String addHandler(String input) {
        String output = input + "|\nContent-type: " + type;
        if (next == null) {
            return output;
        } else {
            return next.addHandler(output);
        }
    }
}
