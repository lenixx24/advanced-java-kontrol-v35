package ua.university;

public class BankTransferPayment implements PaymentMethod{

    public String name() {
        return "Bank Transfer";
    }

    public void pay(Money amount) throws  IllegalArgumentException {
        System.out.println("Paying "+amount.multiply(0.97).cents()+" via "+name());
    }
}
