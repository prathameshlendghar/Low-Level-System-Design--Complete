package PaymentGatewayAdapter;

public interface IPayPalGatewayAdaptee {
    public String makePayment(int amount, String pin);
    public void getPaymentStatus(String paymentId);
    public void getPaymentDetailsOnMail(String paymentId);
    public void setPaymentSource(String bankName, String cardNumber, String name, int cvv, String expiryDate);
}
