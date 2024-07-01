package main.behavioralPatterns.memento;

public interface Originator {
    ConfigurationMemento createMemento();
    void restoreMemento(ConfigurationMemento configurationMemento);
}
