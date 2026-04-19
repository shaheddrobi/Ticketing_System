import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TicketSystem system = TicketSystem.getInstance();

        System.out.println("=== Online Ticketing System ===");

        System.out.print("Ticket type: ");
        String type = sc.nextLine();

        Ticket ticket = TicketFactory.createTicket(type);

        System.out.print("Add meal? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            ticket = new MealDecorator(ticket);
        }

        System.out.print("Skip line stamps (0-3): ");
        int skip = sc.nextInt();
        sc.nextLine();

        if (skip > 0) {
            ticket = new PriorityAccessDecorator (ticket, skip);
        }

        System.out.println("\n" + ticket.getDescription());
        System.out.println("Price before discount: " + ticket.getPrice());

        System.out.println("\nDiscount:");
        System.out.println("1. Community");
        System.out.println("2. VIP (free)");
        System.out.println("3. Loyalty");
        System.out.println("4. None");

        int choice = Integer.parseInt(sc.nextLine());

        DiscountStrategy discount;

        switch (choice) {
            case 1: discount = new CommunityDiscount(10); break;
            case 2: discount = new GuestVIPDiscount(); break;
            case 3: discount = new LoyaltyDiscount(); break;
            default: discount = price -> price;
        }

        double finalPrice = discount.applyDiscount(ticket.getPrice());

        System.out.println("Final Price: " + finalPrice);

        User user = new User("Student");
        system.notifications.subscribe(user);
        system.notifications.notifyAllUsers("Booking Confirmed!");

        sc.close();
    }
}