package br.com.strategy.method;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Validating credit card...");
    }
}
