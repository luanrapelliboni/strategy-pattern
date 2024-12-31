package br.com.strategy;

public class NoStrategy {
    /**
     *
     * @param paymentMethod - Ex: 1 - Credit Card | 2 - Payment Slip | 3 - PIX
     * @param amount - Ex: 30.0
     */
    public void pay(int paymentMethod, double amount) {
        if (paymentMethod == 1) {
            System.out.println("Validating credit card...");
        } else if (paymentMethod == 2) {
            System.out.println("Generating barcode...");
        } else if (paymentMethod == 3) {
            System.out.println("Generating qrcode...");
        } else {
            throw new IllegalArgumentException("Payment method not supported.");
        }
    }
}
