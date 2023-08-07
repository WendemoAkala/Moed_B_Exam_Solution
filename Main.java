package ShowTicketsManagementSoftwareSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(1, "Yossi", "Akala", "yossi@gmail.com", "38 Yavne", CustomerType.VIP, 0.1);
        Customer secondCustomer = new Customer(2, "Dror", "Kreif", "dror@gmail.com", "12 Ashedod", CustomerType.REGULAR, null);
        Show film = new Show(1,"Rocki","07/08/2023",new ArrayList<>());
        FoodVoucher foodVoucher = new FoodVoucherImpl();
        firstCustomer.takeFoodVoucher(foodVoucher);
        secondCustomer.takeFoodVoucher(foodVoucher);
    }
}
