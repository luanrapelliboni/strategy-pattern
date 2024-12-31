package br.com.strategy.enums;

import br.com.strategy.method.CreditCard;
import br.com.strategy.method.PaymentMethod;
import br.com.strategy.method.PaymentSlip;
import br.com.strategy.method.Pix;

public enum PaymentType {
    CREDIT_CARD(new CreditCard()),
    PAYMENT_SLIP(new PaymentSlip()),
    PIX(new Pix());

    private PaymentMethod paymentMethod;

    PaymentType(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(double amount) {
        paymentMethod.pay(amount);
    }
}
