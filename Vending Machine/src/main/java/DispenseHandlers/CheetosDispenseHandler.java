package DispenseHandlers;

public class CheetosDispenseHandler extends SnackDispenseHandler {
    public CheetosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String selection) {
        if(selection.equals("Cheetos")) {
            System.out.println("Dispensing Cheetos");
        } else {
            super.handleRequest(selection);
        }
    }
}
