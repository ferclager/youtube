import java.util.ArrayList;
import java.util.List;

public class CompositeComponent extends Component {
    private List<Component> components = new ArrayList<>();

    public CompositeComponent(String name) {
        super(name, 0);
    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component c : components) {
            total += c.getPrice();
        }
        return total;
    }
}
