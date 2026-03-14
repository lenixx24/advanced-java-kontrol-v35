package ua.university;

public class BankTransferPayment implements PaymentMethod{

    public String name() {
        return "Bank Transfer";
    }

    public void pay(int amount) throws  IllegalArgumentException {
        System.out.println("Paying "+amount*0.97+" via "+name());
    }
}
