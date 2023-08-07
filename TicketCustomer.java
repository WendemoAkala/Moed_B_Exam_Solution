package ShowTicketsManagementSoftwareSystem;

public class TicketCustomer {
    private String name;
    private String email;

    public TicketCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
