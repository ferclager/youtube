public class Saludo {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hola, " + args[0]);
        } else {
            System.out.println("Hola, mundo!");
        }    }
}
