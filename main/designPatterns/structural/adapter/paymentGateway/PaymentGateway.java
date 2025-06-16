package main.designPatterns.structural.adapter.paymentGateway;

public class PaymentGateway implements Payment {

    PaymentAdapter adapter;

    @Override
    public void pay(String paymentType) {
        if(paymentType.equalsIgnoreCase("UPI")) {
            System.out.println("Paying via UPI");
        } else if(paymentType.equalsIgnoreCase("DEBIT")
                || paymentType.equalsIgnoreCase("CREDIT")) {
            adapter = new PaymentAdapter(paymentType);
            adapter.pay(paymentType);
        } else {
            System.out.println("Invalid Payment mode");
        }
    }
}
