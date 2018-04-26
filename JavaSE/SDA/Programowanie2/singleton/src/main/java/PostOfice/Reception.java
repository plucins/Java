package PostOfice;

public class Reception {

    public Ticket getTicket(){
        int ticketNumber = TicketGenerator.getInstance().generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("PostOfice.Reception");

        return ticket;
    }


}
