class MealDecorator extends TicketDecorator {

    public MealDecorator(Ticket ticket) {
        super(ticket);
        this.ticket.price += 150;
    }

    public String getDescription() {
        return ticket.getDescription() + " + Meal";
    }
}