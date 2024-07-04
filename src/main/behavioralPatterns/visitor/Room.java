package main.behavioralPatterns.visitor;

public interface Room {
    void accept(Visitor visitor);
}
