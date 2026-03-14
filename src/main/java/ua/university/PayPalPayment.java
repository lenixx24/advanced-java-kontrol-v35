package ua.university;

public class PayPalPayment implements PaymentMethod{

    public String name() {
        return "PayPal";
    }


    public void pay(Money amount) throws  IllegalArgumentException {
        if(amount.cents()<500) throw new IllegalArgumentException("Amount must be >= 500");
         System.out.println("Paying "+amount.cents()+" via "+name());
    }
}
