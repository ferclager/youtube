public class Editor {

    private final EventManager events = new EventManager("open", "save", "delete");
    private String file = "";

    void openFile(String fileName) {
        this.file = fileName;
        events.notify("open", file);
    }

    void saveFile() {
        if (!file.isEmpty()) {
            events.notify("save", file);
        }
    }

    void deleteFile() {
        if (!file.isEmpty()) {
            events.notify("delete", file);
            file = "";
        }
    }

    public EventManager getEvents() {
        return events;
    }
}
