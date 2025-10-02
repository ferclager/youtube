import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private static final Memento NOT_FOUND = new Memento("NOT FOUND");
    List<Memento> mementoList = new ArrayList<>();

    public void saveState(Memento memento) {
        mementoList.add(memento);
    }

    public Memento restoreState(int index) {
        if (index >= mementoList.size()) {
            return NOT_FOUND;
        }
        return mementoList.get(index);
    }
}
