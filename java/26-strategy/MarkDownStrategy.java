public class MarkDownStrategy implements PrintStrategy {

    @Override
    public String format(String input) {
        return "**" + input + "**";
    }
}
