package br.com.strategy;

import br.com.strategy.enums.PaymentType;

public class ElegantStrategy {
    /**
     *
     * @param code - Ex: CREDIT_CARD, PAYMENT_SLIP, PIX
     * @param amount - Ex: 30.0
     */
    public void pay(String code, double amount) {
        PaymentType.valueOf(code).pay(amount);
    }
}


