package org.br.behavioral;

import org.br.behavioral.observer.action.GenerateOrderHandler;
import org.br.behavioral.command.order.GenerateOrder;
import org.br.behavioral.observer.action.SaveOnDataBase;
import org.br.behavioral.observer.action.SendEmailOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTest {

    @Test
    public void testCommand() {
        String client = "Anna";
        BigDecimal budgetValue = new BigDecimal("500");
        int itensQuantity = 6;

        GenerateOrder generator = new GenerateOrder(client, budgetValue, itensQuantity);
        org.br.behavioral.command.order.GenerateOrderHandler
                handler = new org.br.behavioral.command.order.GenerateOrderHandler();
        handler.execute(generator);
    }

    @Test
    public void testObserver() {
        String client = "Anna";
        BigDecimal budgetValue = new BigDecimal("500");
        int itensQuantity = 6;

        GenerateOrder generator = new GenerateOrder(client, budgetValue, itensQuantity);
        GenerateOrderHandler handler =
                new GenerateOrderHandler(
                        Arrays.asList(new SaveOnDataBase(), new SendEmailOrder()));

        // Facade
        handler.execute(generator);
    }

}
