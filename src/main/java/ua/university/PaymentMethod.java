package ua.university;

public interface PaymentMethod {
    String name();
    void pay(int amount);
}
