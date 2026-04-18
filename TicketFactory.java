class TicketFactory {
    public static Ticket createTicket(String type) {
        switch (type.toLowerCase()) {
            case "regular": return new RegularTicket();
            case "premium": return new PremiumTicket();
            case "vip": return new VIPTicket();
            case "vendor": return new VendorTicket();
            default: throw new IllegalArgumentException("Invalid ticket type");
        }
    }
}