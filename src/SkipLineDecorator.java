class PriorityAccessDecorator  extends TicketDecorator {

    public PriorityAccessDecorator (Ticket ticket, int count) {
        super(ticket);
        this.ticket.price += 50 * count;
    }

    public String getDescription() {
        return ticket.getDescription() + " + SkipLine";
    }
}