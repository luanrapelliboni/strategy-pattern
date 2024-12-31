package br.com.processor;

import br.com.strategy.method.CreditCard;
import br.com.strategy.method.PaymentSlip;
import br.com.strategy.method.Pix;

public class PaymentProcessor {
    public static void creditCard(double amount) {
        new CreditCard().pay(amount);
    }

    public static void paymentSlip(double amount) {
        new PaymentSlip().pay(amount);
    }

    public static void pix(double amount) {
        new Pix().pay(amount);
    }
}
