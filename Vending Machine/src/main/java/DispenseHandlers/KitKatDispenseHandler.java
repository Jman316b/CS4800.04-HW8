package DispenseHandlers;

public class KitKatDispenseHandler extends SnackDispenseHandler {
    public KitKatDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(String selection) {
        if(selection.equals("KitKat")) {
            System.out.println("Dispensing KitKat");
        } else {
            super.handleRequest(selection);
        }
    }
}
