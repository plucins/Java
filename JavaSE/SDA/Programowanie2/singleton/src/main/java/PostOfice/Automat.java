package PostOfice;

public class Automat {

    public Ticket getTicket(){
        int ticketNumber = TicketGenerator.getInstance().generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("PostOfice.Automat");

        return ticket;
    }
}
