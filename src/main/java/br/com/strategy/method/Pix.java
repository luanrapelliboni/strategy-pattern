package br.com.strategy.method;

public class Pix implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Generating qrcode...");
    }
}
