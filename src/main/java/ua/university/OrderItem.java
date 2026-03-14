package ua.university;

import java.util.Objects;

class OrderItem {
    private final String productID;
    private final Money price;
    private final int quantity;

    public OrderItem(String productID, Money price, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be > 0");
        }
        this.productID = Objects.requireNonNull(productID, "sku");
        this.price = Objects.requireNonNull(price, "price");
        this.quantity = quantity;
    }

    public Money total() {
        return price.multiply(quantity);
    }

    public String productID() {
        return productID;
    }
}
