package ua.university;

public abstract class OrderProcessorTemplate {
    final void process(){
       validate();
       countTotal();
       pay();
       endOrder();
    }
    final boolean validatePromoCode(String promocode){
        if(promocode==null) return false;
        return promocode.equals("SPRING15");
    }
    public abstract void countTotal();
    public abstract void pay();
    public abstract void validate();
    public abstract void endOrder();
}
