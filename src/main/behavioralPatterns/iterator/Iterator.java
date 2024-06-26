package main.behavioralPatterns.iterator;

public interface Iterator {
    boolean hasNext();
    Object next();
    void reset();
}
