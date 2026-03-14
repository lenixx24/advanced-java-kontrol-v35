package ua.university;

public interface PaymentMethod {
    String name();
    void pay(Money amount) throws IllegalArgumentException;
}
