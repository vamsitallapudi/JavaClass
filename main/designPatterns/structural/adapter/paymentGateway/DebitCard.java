package main.designPatterns.structural.adapter.paymentGateway;

public class DebitCard implements NewPayment{


    @Override
    public void makePay() {
        System.out.println("Paying via debit card");
    }
}
