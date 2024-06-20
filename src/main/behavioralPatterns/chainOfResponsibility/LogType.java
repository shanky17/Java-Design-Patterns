package main.behavioralPatterns.chainOfResponsibility;

public class LogType {
    private Priority priority;

    public LogType(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
