package StateOfVendingMachine;
import VendingMachine.*;

public class paymentState implements StateOfVendingMachine {

    public void selectSnack(VendingMachine vendingMachine, String selection) {
//        do nothing
    }

    public void insertMoney(VendingMachine vendingMachine, double money) {
        double price = vendingMachine.getCurrentSelection().getPrice();
        double newTotal = money + vendingMachine.getCurrentPaymentTotal();
        vendingMachine.setCurrentPaymentTotal(newTotal);

        if (newTotal == price) {
            System.out.println("Payment Successful");
            vendingMachine.dispenseSnack();
            vendingMachine.setStateOfVendingMachine(new idleState());
        } else if (newTotal > price) {
            System.out.printf("Payment Successful, Refunding Change: $%.2f%n", (money - price));
            vendingMachine.returnChange(newTotal-price);
            vendingMachine.dispenseSnack();
            vendingMachine.setStateOfVendingMachine(new idleState());
        } else if (newTotal < price) {
            System.out.printf("Insert Remaining Amount: $%.2f%n", (price - newTotal));
        } else {
            System.out.printf("Payment Failed, Refunding Payment: $%.2f%n", newTotal);
        }
    }

    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Dispense Rejected, Insert Payment First");
    }
}
