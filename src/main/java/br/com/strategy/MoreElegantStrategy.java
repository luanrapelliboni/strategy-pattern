package br.com.strategy;


import br.com.strategy.enums.MoreElegantPaymentType;

public class MoreElegantStrategy {
    /**
     *
     * @param code - Ex: CREDIT_CARD, PAYMENT_SLIP, PIX
     * @param amount - Ex: 30.0
     */
    public void pay(String code, double amount) {
        MoreElegantPaymentType.valueOf(code).pay(amount);
    }
}




