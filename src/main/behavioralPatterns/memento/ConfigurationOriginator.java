package main.behavioralPatterns.memento;

public class ConfigurationOriginator implements Originator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }

    @Override
    public void restoreMemento(ConfigurationMemento configurationMemento) {
        setHeight(configurationMemento.getHeight());
        setWidth(configurationMemento.getWidth());
    }
}
