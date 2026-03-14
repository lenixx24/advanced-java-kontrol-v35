package ua.university;

class PaymentProcessor{
    public void process(PaymentMethod method, Money amount) {
        try{
            method.pay(amount);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}