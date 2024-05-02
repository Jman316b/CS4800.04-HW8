package DispenseHandlers;

public class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }

    public void handleRequest(String selection) {
        if(next != null) {
            next.handleRequest(selection);
        }
    }
}
