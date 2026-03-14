package ua.university;

public class PayPalPayment implements PaymentMethod{

    public String name() {
        return "PayPal";
    }


    public void pay(int amount) throws  IllegalArgumentException {
        if(amount<500) throw new IllegalArgumentException("Amount must be >= 500");
         System.out.println("Paying "+amount+" via "+name());
    }
}
