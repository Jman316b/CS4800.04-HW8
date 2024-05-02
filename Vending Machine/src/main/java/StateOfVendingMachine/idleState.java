package StateOfVendingMachine;
import VendingMachine.*;

public class idleState implements StateOfVendingMachine {
    public void selectSnack(VendingMachine vendingMachine, String selection) {
        if(vendingMachine.findSnack(selection)){
            System.out.println(selection + " Is Available, Insert Payment");
            vendingMachine.setStateOfVendingMachine(new paymentState());
        } else {
            System.out.println(selection + " Is Not Available, Make Another Selection");
        }
    }

    public void insertMoney(VendingMachine vendingMachine, double money) {
        System.out.println("Please Make Selection First");
        vendingMachine.returnChange(money);
    }

    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Dispense Rejected, Please Make Selection");
    }
}
