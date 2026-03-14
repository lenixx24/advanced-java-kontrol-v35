package ua.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Order {
    private final String id;
    private Email userEmail;
    private final List<OrderItem> items = new ArrayList<>();
    public Order(String id, String userEmail){
        this.id=id;
        try {
            this.userEmail = new Email(userEmail);
        }
        catch(IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void addItem(OrderItem item) {
       if(this.findById(item.productID()).isPresent()) throw new IllegalArgumentException("Product with this ID exists");
        items.add(Objects.requireNonNull(item, "item"));
    }

    public Money total() {
        Money sum = Money.zero();
        for (OrderItem item : items) {
            sum = sum.add(item.total());
        }
        return sum;
    }
    public Optional<OrderItem> findById(String productID){
        for(OrderItem item: items){
            if(item.productID().equals(productID)) return Optional.of(item);
        }
        return Optional.empty();
    }

    public String ID() {
        return id;
    }
}

