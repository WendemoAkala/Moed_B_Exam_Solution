package ShowTicketsManagementSoftwareSystem;

import java.util.ArrayList;

public class TicketManagementSystem {
    private ArrayList<Ticket> tickets;

    public TicketManagementSystem() {
        tickets = new ArrayList<>();
    }

    // Add a ticket to the system
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    // Get all tickets in the system
    public ArrayList<Ticket> getAllTickets() {
        return tickets;
    }

    // Get a ticket by its unique id
    public Ticket getTicketById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null; // Ticket not found
    }
}
