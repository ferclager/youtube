public class LogNotificationListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("[ log  \uD83D\uDCDD ] " + file + " - " + eventType);
    }
}
