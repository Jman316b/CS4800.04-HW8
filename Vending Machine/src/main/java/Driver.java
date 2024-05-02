import VendingMachine.*;
import StateOfVendingMachine.*;
import DispenseHandlers.*;

public class Driver {
//  Vending machine starts in idle state.
//  User should select a snack, selectSnack(), from Vending Machine.
//  Vending machine should wait for user to insert money, insertMoney().
//  If money inserted is >= price then dispense item if enough quantity or return money.
//  To dispense snack, the VendingMachine class should call the dispenseSnack() method on the current state object.
//  The state object will handle the event and transition to the appropriate state based on the availability of snacks.
//
//  Create driver with 6 different snacks and Chain of Responsibility in this order
//  ->Coke, Pepsi, Cheetos, Doritos, KitKat, and Snickers.
//
//  Your driver should include at least one case where the quantity hits 0 with snickers.
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addSnack(new Snack("Coke", 2, 6));
        vendingMachine.addSnack(new Snack("Pepsi", 2, 7));
        vendingMachine.addSnack(new Snack("Cheetos", 3, 8));
        vendingMachine.addSnack(new Snack("Doritos", 3, 7));
        vendingMachine.addSnack(new Snack("Kitkat", 1, 8));
        vendingMachine.addSnack(new Snack("Snickers", 1, 1));

        System.out.println("### Buying Cheetos");
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(2);
        vendingMachine.insertMoney(1);
        System.out.println();

        System.out.println("### Buying a Coke");
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(3);
        System.out.println();

        System.out.println("### Buying a KitKat");
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(3);
        System.out.println();

        System.out.println("### Buying a Snickers");
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1);
        System.out.println();

        System.out.println("### Buying a Snickers, None Available");
        vendingMachine.selectSnack("Snickers");
    }
}
