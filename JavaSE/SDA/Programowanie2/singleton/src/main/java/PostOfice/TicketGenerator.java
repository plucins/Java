package PostOfice;

public class TicketGenerator {

    private static final TicketGenerator INSTANCE = new TicketGenerator();
    private int ticketNumber = 0;

    private TicketGenerator(){
    }

    public static TicketGenerator getInstance(){
        return INSTANCE;
    }

    public int generateNumber(){
        return ticketNumber++;
    }


}
