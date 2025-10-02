public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("initial state");
        Caretaker caretaker = new Caretaker();

        caretaker.saveState(originator.create());
        System.out.println("Current state is " + originator.getState());

        originator.setState("state 1");
        caretaker.saveState(originator.create());
        System.out.println("Current state is " + originator.getState());

        originator.setState("state 2");
        caretaker.saveState(originator.create());
        System.out.println("Current state is " + originator.getState());

        originator.setState("final state");
        caretaker.saveState(originator.create());
        System.out.println("Current state is " + originator.getState());

        System.out.println("------------");
        show(0, originator, caretaker);
        show(1, originator, caretaker);
        show(3, originator, caretaker);
        show(2, originator, caretaker);
        show(3, originator, caretaker);
    }

    private static void show(int index, Originator originator, Caretaker caretaker) {
        originator.restore(caretaker.restoreState(index));
        System.out.println("Current state (index " + index + ") is " + originator.getState());
    }
}
