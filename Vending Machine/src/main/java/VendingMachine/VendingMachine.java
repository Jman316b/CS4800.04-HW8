package VendingMachine;

import DispenseHandlers.*;
import StateOfVendingMachine.*;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Snack> snacks;
    private StateOfVendingMachine stateOfVendingMachine;
    private SnackDispenseHandler snackDispenseHandler;
    private Snack currentSelection;
    private int selectionIndex;
    private double currentPaymentTotal;

    public VendingMachine() {
        snacks = new ArrayList<>();
        stateOfVendingMachine = new idleState();
        snackDispenseHandler = new CokeDispenseHandler(new PepsiDispenseHandler(new CheetosDispenseHandler(new DoritosDispenseHandler(new KitKatDispenseHandler(new SnackDispenseHandler(null))))));
    }

    public ArrayList<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public StateOfVendingMachine getStateOfVendingMachine() {
        return stateOfVendingMachine;
    }

    public void setStateOfVendingMachine(StateOfVendingMachine stateOfVendingMachine) {
        this.stateOfVendingMachine = stateOfVendingMachine;
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    public void setSnackDispenseHandler(SnackDispenseHandler snackDispenseHandler) {
        this.snackDispenseHandler = snackDispenseHandler;
    }

    public Snack getCurrentSelection() {
        return currentSelection;
    }

    public void setCurrentSelection(Snack currentSelection) {
        this.currentSelection = currentSelection;
    }

    public double getCurrentPaymentTotal() {
        return currentPaymentTotal;
    }

    public void setCurrentPaymentTotal(double currentPaymentTotal) {
        this.currentPaymentTotal = currentPaymentTotal;
    }

    public boolean findSnack(String selection){
        for (int i = 0; i < snacks.size(); i++){
            if (snacks.get(i).getName().toLowerCase().equals(selection.toLowerCase())){
                if (snacks.get(i).getQuantity() > 0){
                    currentSelection = snacks.get(i);
                    selectionIndex = i;
                    return true;
                }
            }
        }
        return false;
    }

    public void selectSnack(String snack){
        System.out.println(snack + " Selected");
        stateOfVendingMachine.selectSnack(this, snack);
    }

    public void insertMoney(double money){
        System.out.printf("$%.2f Inserted%n", money);
        stateOfVendingMachine.insertMoney(this, money);
    }

    public void dispenseSnack(){
        snackDispenseHandler.handleRequest(currentSelection.getName());
        int quantity = snacks.get(selectionIndex).getQuantity();
        snacks.get(selectionIndex).setQuantity(quantity-1);
        currentPaymentTotal = 0;
    }

    public void returnChange(double change){
        currentPaymentTotal -= change;
        System.out.printf("$%.2f Returned%n", change);
    }
}
