package ShowTicketsManagementSoftwareSystem;

public abstract class Ticket {
    private Integer id;
    private String showName;
    private  String showDate;
    private Integer rowNumber;
    private Integer sitNumber;
    private  TicketCustomer customer;
    private Double ticketPrice;

    public Ticket(Integer id, String showName, String showDate, Integer rowNumber, Integer sitNumber, TicketCustomer customer, Double ticketPrice) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.sitNumber = sitNumber;
        this.customer = customer;
        this.ticketPrice = ticketPrice;
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

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Integer getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(Integer sitNumber) {
        this.sitNumber = sitNumber;
    }

    public TicketCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(TicketCustomer customer) {
        this.customer = customer;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public double calculatePrice() {
        return ticketPrice;
    }
}
