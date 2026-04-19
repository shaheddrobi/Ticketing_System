abstract class TicketDecorator extends Ticket {
    protected Ticket ticket;

    public TicketDecorator(Ticket ticket) {
        super(ticket.getPrice());
        this.ticket = ticket;
    }

    public double getPrice() {
        return ticket.getPrice();
    }
}