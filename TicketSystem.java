class TicketSystem {
    private static TicketSystem instance;
    public NotificationSystem notifications;

    private TicketSystem() {
        notifications = new NotificationSystem();
    }

    public static TicketSystem getInstance() {
        if (instance == null) {
            instance = new TicketSystem();
        }
        return instance;
    }
}