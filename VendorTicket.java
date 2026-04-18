class VendorTicket extends Ticket {
    public VendorTicket() {
        super(1500);
    }

    public String getDescription() {
        return "Vendor Ticket";
    }
}