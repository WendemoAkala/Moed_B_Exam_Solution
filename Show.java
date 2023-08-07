package ShowTicketsManagementSoftwareSystem;

import java.util.ArrayList;

public class Show {
    private Integer id;
    private String showName;
    private  String showDate;
    private ArrayList<Ticket> listOfShowTickets;

    public Show(Integer id, String showName, String showDate, ArrayList<Ticket> listOfShowTickets) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.listOfShowTickets = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Ticket> getListOfShowTickets() {
        return listOfShowTickets;
    }

    public void setListOfShowTickets(ArrayList<Ticket> listOfShowTickets) {
        this.listOfShowTickets = listOfShowTickets;
    }
    public void addTicket(Ticket ticket) {
        listOfShowTickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        listOfShowTickets.remove(ticket);
    }

    // Calculate show revenue (sum of ticket prices)
    public double calculateShowRevenue() {
        double totalRevenue = 0.0;
        for (Ticket ticket : listOfShowTickets) {
            totalRevenue += ticket.calculatePrice();
        }
        return totalRevenue;
    }

    // Calculate total discount given for VIP tickets
    public double calculateTotalDiscountGiven() {
        double totalDiscount = 0.0;
        for (Ticket ticket : listOfShowTickets) {
            if (ticket instanceof VipTicket) {
                totalDiscount += ((VipTicket) ticket).getTicketPrice();
            }
        }
        return totalDiscount;
    }
}
