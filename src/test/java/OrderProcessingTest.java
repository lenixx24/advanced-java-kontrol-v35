import org.junit.jupiter.api.Test;
import ua.university.CardPayment;
import ua.university.Order;
import ua.university.OrderProcessor;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderProcessingTest {
    @Test
    void moneyCantBeNagative(){
       assertThrows(IllegalArgumentException.class, ()->new OrderProcessor( new Order("1", "@"), new CardPayment(), -100)) ;
    }
}
