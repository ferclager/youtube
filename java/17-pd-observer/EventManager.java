import java.util.*;

/// Registry
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String ... operations) {
        for (String op : operations) {
            listeners.put(op, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener myListener) {
        List<EventListener> events = listeners.get(event);
        if (!events.contains(myListener)) {
            events.add(myListener);
        }
    }
    public void unsubscribe(String event, EventListener myListener) {
        List<EventListener> events = listeners.get(event);
        events.remove(myListener);
    }

    public void notify(String eventType, String file) {
        List<EventListener> events = listeners.get(eventType);
        for (EventListener event : events) {
            event.notify(eventType, file);
        }
    }
}
