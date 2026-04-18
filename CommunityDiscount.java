class CommunityDiscount implements DiscountStrategy {
    private int percent;

    public CommunityDiscount(int percent) {
        this.percent = percent;
    }

    public double applyDiscount(double price) {
        return price - (price * percent / 100.0);
    }
}