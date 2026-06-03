public class Client {
    public static void main(String[] args) {
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);

        Expression sum = new AddExpression(five, three);

        System.out.println(five.interpret() + " + " + three.interpret() + " = " + sum.interpret());
    }
}
