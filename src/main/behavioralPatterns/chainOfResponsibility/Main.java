package main.behavioralPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogHandler handler1 = new InfoLogHandler();
        LogHandler handler2 = new ErrorLogHandler();
        LogHandler handler3 = new CriticalLogHandler();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        LogType logType1 = new LogType(Priority.INFO);
        LogType logType2 = new LogType(Priority.ERROR);
        LogType logType3 = new LogType(Priority.CRITICAL);

        handler1.handle(logType1, "This is the info log");
        handler1.handle(logType2, "This is the error log");
        handler1.handle(logType3, "This is the critical log");
    }
}
