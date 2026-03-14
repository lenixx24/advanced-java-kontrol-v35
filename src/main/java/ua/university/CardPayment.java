package ua.university;

public class CardPayment implements PaymentMethod{

        public String name() {
            return "Card";
        }

        public void pay(Money amount) throws IllegalArgumentException{
            if(amount.cents()>40000) throw new IllegalArgumentException("Amount must be <= 40000");
            System.out.println("Paying "+amount.cents()+" via "+name());
        }
}
