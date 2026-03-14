package ua.university;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class OrderProcessor extends OrderProcessorTemplate{
    private Order order;
    private PaymentMethod pm;
    private Money amount;
    private static final Logger log = LoggerFactory.getLogger(OrderProcessor.class);
    public OrderProcessor(Order order, PaymentMethod pm, long amount){
        this.order=order;
        try{
            this.amount=new Money(amount);
        }
        catch(IllegalArgumentException e){
            log.warn(e.getMessage());
        }
    }


    @Override
    public void countTotal() {

    }

    @Override
    public void pay() {
          PaymentProcessor paymentProcessor= new PaymentProcessor();
          try{
              paymentProcessor.process(pm, amount);
          } catch (RuntimeException e) {
              log.warn(e.getMessage());
          }
    }

    @Override
    public void validate() {

    }

    @Override
    public void endOrder() {
          log.info("Order {} for {} cents processed successfully", order.ID(), order.total().cents());
    }
}
