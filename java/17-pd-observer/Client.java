public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener emailListener = new EmailNotificationListener();
        LogNotificationListener logListener = new LogNotificationListener();

        editor.getEvents().subscribe("open", emailListener);
        editor.getEvents().subscribe("save", emailListener);

        editor.getEvents().subscribe("open", logListener);
        editor.getEvents().subscribe("save", logListener);
        editor.getEvents().subscribe("delete", logListener);

        editor.openFile("fer.txt");
        editor.saveFile();
        editor.saveFile();
        editor.saveFile();
        editor.deleteFile();
        editor.saveFile();
        editor.deleteFile();

        System.out.println("-----");
        editor.getEvents().unsubscribe("delete", logListener);
        editor.openFile("fer.jpg");
        editor.saveFile();
        editor.deleteFile();
    }
}
