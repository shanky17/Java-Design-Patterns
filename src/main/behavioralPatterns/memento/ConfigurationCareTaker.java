package main.behavioralPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> mementos = new ArrayList<>();

    public void addMemento(ConfigurationMemento configurationMemento) {
        mementos.add(configurationMemento);
    }

    public ConfigurationMemento restore() {
        if (!mementos.isEmpty()) {
            ConfigurationMemento memento = mementos.getLast();
            mementos.removeLast();
            return memento;
        }

        return null;
    }
}
