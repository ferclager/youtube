public class Client {
    public static void main(String[] args) {
        Coffee simple = new SimpleCoffee();
        Coffee espresso = new Espresso();

        System.out.println(simple.getDescription() + ": " + simple.getCost());
        System.out.println(espresso.getDescription() + ": " + espresso.getCost());

        simple = new MilkDecorator(simple);
        System.out.println(simple.getDescription() + ": " + simple.getCost());
        simple = new SugarDecorator(simple);
        System.out.println(simple.getDescription() + ": " + simple.getCost());
        simple = new CappuccinoDecorator(simple);
        System.out.println(simple.getDescription() + ": " + simple.getCost());

        espresso = new SugarDecorator(espresso);
        System.out.println(espresso.getDescription() + ": " + espresso.getCost());
    }
}
