public class Client {
    public static void main(String[] args) {
        LowerCaseStrategy lowerCaseStrategy = new LowerCaseStrategy();
        UpperCaseStrategy upperCaseStrategy = new UpperCaseStrategy();
        MarkDownStrategy markDownStrategy = new MarkDownStrategy();
        final String input = "En un lugar de la MANCHA DE CUYO NOMBRE no quiero acordarme";

        new PrintContext(lowerCaseStrategy).print(input);
        new PrintContext(upperCaseStrategy).print(input);
        new PrintContext(markDownStrategy).print(input);
    }
}
