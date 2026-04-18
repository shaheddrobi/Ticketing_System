class LoyaltyDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return Math.max(0, price - 150);
    }
}