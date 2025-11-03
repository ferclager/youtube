public class LowerCaseStrategy implements PrintStrategy {
    @Override
    public String format(String input) {
        return input.toLowerCase();
    }
}
