package ShowTicketsManagementSoftwareSystem;

public class VipTicket extends  Ticket{
    private boolean isVIP;
    public VipTicket(Integer id, String showName, String showDate, Integer rowNumber, Integer sitNumber, TicketCustomer customer, Double ticketPrice) {
        super(id, showName, showDate, rowNumber, sitNumber, customer, ticketPrice);
        this.isVIP = isVIP;
    }
    public double calculatePrice() {
        if (!isVIP) {
            throw new RuntimeException("VIP ticket price can only be calculated for VIP customers.");
        }

        return getTicketPrice() - customerDiscount();
    }
    private double customerDiscount() {
        return getTicketPrice() * 0.1;
    }

}
