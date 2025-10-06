public class CappuccinoDecorator extends CoffeeDecorator{
    public CappuccinoDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk foam";
    }
}
