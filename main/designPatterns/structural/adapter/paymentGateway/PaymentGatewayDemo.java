package main.designPatterns.structural.adapter.paymentGateway;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        gateway.pay("upi");
        gateway.pay("debit");
    }
}
