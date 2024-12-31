package br.com.strategy;

import br.com.strategy.method.CreditCard;
import br.com.strategy.method.PaymentSlip;
import br.com.strategy.method.Pix;

public class CommonStrategy {
    /**
     *
     * @param paymentMethodCode - Ex: 1 - Credit Card | 2 - Payment Slip | 3 - PIX
     * @param amount - Ex: 30.0
     */
    public void pay(int paymentMethodCode, double amount) {
        var paymentMethod = switch(paymentMethodCode) {
            case 1 -> new CreditCard();
            case 2 -> new PaymentSlip();
            case 3 -> new Pix();
            default -> throw new IllegalStateException("Payment method is not supported.");
        };
        paymentMethod.pay(amount);
    }
}


