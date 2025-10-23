public class Client {
    public static void main(String[] args) {
        RealFileSystemProxy proxy = new RealFileSystemProxy();
        System.out.println("content " + proxy.readFile("test.txt"));
        System.out.println("content " + proxy.readFile("test.txt"));
        System.out.println("content " + proxy.readFile("test.txt"));
        System.out.println("content " + proxy.readFile("test2.txt"));
    }
}
