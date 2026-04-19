abstract class Ticket {
    protected double price;

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDescription();
}