public class UpperCaseStrategy implements PrintStrategy {
    @Override
    public String format(String input) {
        return input.toUpperCase();
    }
}
