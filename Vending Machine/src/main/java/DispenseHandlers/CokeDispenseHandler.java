package DispenseHandlers;

public class CokeDispenseHandler extends SnackDispenseHandler{
    public CokeDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }
    
    public void handleRequest(String selection) {
        if(selection.equals("Coke")) {
            System.out.println("Dispensing Coke");
        } else {
            super.handleRequest(selection);
        }
    }
}
