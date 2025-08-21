public class Client {
    public static void main(String[] args) {
        Vehicle coche1 = new Car(4, 50_000, 3);
        Vehicle coche2 = coche1.clone();

        Vehicle bici1 = new Bicyle(2, 50, true);
        Vehicle bici2 = bici1.clone();

        coche2.isCloneOf(coche1);
        coche1.isCloneOf(coche2);

        bici2.isCloneOf(bici1);
        bici1.isCloneOf(bici2);

        bici2.isCloneOf(coche1);
        coche2.isCloneOf(bici1);
    }
}
