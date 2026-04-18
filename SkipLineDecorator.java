class SkipLineDecorator extends TicketDecorator {

    public SkipLineDecorator(Ticket ticket, int count) {
        super(ticket);
        this.ticket.price += 50 * count;
    }

    public String getDescription() {
        return ticket.getDescription() + " + SkipLine";
    }
}