package StateOfVendingMachine;
import VendingMachine.*;

public interface StateOfVendingMachine {
    void selectSnack(VendingMachine vendingMachine, String selection);
    void insertMoney(VendingMachine vendingMachine, double money);
}
