package main.behavioralPatterns.chainOfResponsibility;

public class ErrorLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handle(LogType logType, String message) {
        // if the current handler can handle the request
        if (logType.getPriority() == Priority.ERROR) {
            System.out.println("ERROR: " + message);
        }

        // if not, pass the request onto the next handler
        else if (nextHandler != null) {
            nextHandler.handle(logType, message);
        }
    }

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
