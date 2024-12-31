package br.com;

import br.com.strategy.CommonStrategy;
import br.com.strategy.ElegantStrategy;
import br.com.strategy.MoreElegantStrategy;
import br.com.strategy.NoStrategy;

public class Runner
{
    public static void main( String[] args ) {
        var noStrategy = new NoStrategy();
        noStrategy.pay(1, 10);
        noStrategy.pay(2, 10);
        noStrategy.pay(3, 10);

        var commonStrategy = new CommonStrategy();
        commonStrategy.pay(1, 10);
        commonStrategy.pay(2, 10);
        commonStrategy.pay(3, 10);

        var elegantStrategy = new ElegantStrategy();
        elegantStrategy.pay("CREDIT_CARD", 30);
        elegantStrategy.pay("PAYMENT_SLIP", 30);
        elegantStrategy.pay("PIX", 30);

        var moreElegantStrategy = new MoreElegantStrategy();
        moreElegantStrategy.pay("CREDIT_CARD", 30);
        moreElegantStrategy.pay("PAYMENT_SLIP", 30);
        moreElegantStrategy.pay("PIX", 30);
    }
}
