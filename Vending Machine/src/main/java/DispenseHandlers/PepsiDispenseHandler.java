package DispenseHandlers;

public class PepsiDispenseHandler extends SnackDispenseHandler {
    public PepsiDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String selection) {
        if(selection.equals("Pepsi")) {
            System.out.println("Dispensing Pepsi");
        } else {
            super.handleRequest(selection);
        }
    }
}
