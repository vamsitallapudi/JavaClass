package main.designPatterns.structural.adapter.paymentGateway;

public class PaymentAdapter implements Payment{
    private NewPayment newPayment;

    public PaymentAdapter(String paymentType) {
        if(paymentType.equalsIgnoreCase("debit")) {
            newPayment = new DebitCard();
        } else {
            newPayment = new CreditCard();
        }
    }

    @Override
    public void pay(String paymentType) {
        newPayment.makePay();
    }
}
