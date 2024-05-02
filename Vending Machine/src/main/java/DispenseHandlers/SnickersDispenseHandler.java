package DispenseHandlers;

public class SnickersDispenseHandler extends SnackDispenseHandler {
    public SnickersDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String selection) {
        if(selection.equals("Snickers")) {
            System.out.println("Dispensing Snickers");

        } else {
            super.handleRequest(selection);
        }
    }
}
