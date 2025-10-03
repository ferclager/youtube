public class EmailNotificationListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("[email \uD83D\uDCE7 ] " + file + " - " + eventType);
    }
}
