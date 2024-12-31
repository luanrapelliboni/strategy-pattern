package br.com.strategy.method;

public class PaymentSlip implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Generating barcode...");
    }
}
