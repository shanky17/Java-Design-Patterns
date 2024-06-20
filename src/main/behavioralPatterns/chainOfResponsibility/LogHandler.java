package main.behavioralPatterns.chainOfResponsibility;

public interface LogHandler {
    void handle(LogType logType, String message);
    void setNextHandler(LogHandler nextHandler);
}
