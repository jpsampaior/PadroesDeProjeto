package BehavioralPatterns.Chain;

public class AbstractHandler {
    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void processRequest(String request) {
        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
