package main.behavioralPatterns.memento;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        ConfigurationOriginator originator = new ConfigurationOriginator(20, 30);

        // save the state
        ConfigurationMemento snapshot1 = originator.createMemento();

        // add it to the mementos list
        careTaker.addMemento(snapshot1);

        // change the state of originator object
        originator.setHeight(50);
        originator.setWidth(100);

        System.out.println("Before restoring");
        System.out.println("Current state: Height - " + originator.height + " Width - " + originator.width);

        // Restore the previous state
        ConfigurationMemento previousStateMemento = careTaker.restore();
        if (previousStateMemento != null) {
            originator.restoreMemento(previousStateMemento);
        }

        System.out.println("After restoring");
        System.out.println("Current state: Height - " + originator.height + " Width - " + originator.width);
    }
}
