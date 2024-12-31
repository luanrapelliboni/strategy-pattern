package br.com.strategy.enums;

import br.com.processor.PaymentProcessor;

import java.util.function.Consumer;

public enum MoreElegantPaymentType {
    CREDIT_CARD(PaymentProcessor::creditCard),
    PAYMENT_SLIP(PaymentProcessor::paymentSlip),
    PIX(PaymentProcessor::pix);

    private Consumer<Double> consumer;

    MoreElegantPaymentType(Consumer<Double> consumer) {
        this.consumer = consumer;
    }

    public void pay(double amount) {
        consumer.accept(amount);
    }
}
