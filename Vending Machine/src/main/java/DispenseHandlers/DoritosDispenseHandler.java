package DispenseHandlers;

public class DoritosDispenseHandler extends SnackDispenseHandler {
    public DoritosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String selection) {
        if(selection.equals("Doritos")) {
            System.out.println("Dispensing Doritos");
        } else {
            super.handleRequest(selection);
        }
    }
}
