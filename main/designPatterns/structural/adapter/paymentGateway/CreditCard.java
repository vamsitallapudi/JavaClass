package main.designPatterns.structural.adapter.paymentGateway;

public class CreditCard implements NewPayment{
    @Override
    public void makePay() {
        System.out.println("Paying via credit card");
    }
}
