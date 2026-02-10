package PaymentGatewayAdapter;

public class MyApplicationPaymentClient {
    IPayPalGatewayAdaptee payPalGatewayAdaptee;

    MyApplicationPaymentClient(IPayPalGatewayAdaptee payPalGatewayAdaptee){
        this.payPalGatewayAdaptee = payPalGatewayAdaptee;
    }

    public void submitPaymentDetailsToGateway(String bankName, String cardNumber, String name, int cvv, String expiryDate){
        payPalGatewayAdaptee.setPaymentSource(bankName, cardNumber, name, cvv, expiryDate);
    }

    public String makePayment(int amount, String pin){
        String paymentId = payPalGatewayAdaptee.makePayment(amount, pin);
        payPalGatewayAdaptee.getPaymentDetailsOnMail(paymentId);

        return paymentId;
    }
}
