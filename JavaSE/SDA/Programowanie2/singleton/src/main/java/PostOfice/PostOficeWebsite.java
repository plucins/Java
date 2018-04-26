package PostOfice;

public class PostOficeWebsite {

    public Ticket getTicket(){
        int ticketNumber = TicketGenerator.getInstance().generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Website");

        return ticket;
    }
}
