public class Singleton {
    private static volatile Singleton instancia;

    private Singleton() {}

    public static Singleton getInstance() {
        Singleton resultado = instancia;
        if (resultado == null) {
            synchronized (Singleton.class) {
                resultado = instancia;
                if (resultado == null) {
                    resultado = instancia = new Singleton();
                }
            }

        }
        return resultado;
    }
}
