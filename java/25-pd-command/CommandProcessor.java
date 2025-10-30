import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {
    List<Command> commands = new ArrayList<>();

    public CommandProcessor add(Command command) {
        commands.add(command);
        return this;
    }

    public void process() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
