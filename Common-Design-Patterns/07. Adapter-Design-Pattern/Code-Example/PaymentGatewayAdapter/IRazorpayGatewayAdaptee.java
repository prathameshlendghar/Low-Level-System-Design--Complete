package PaymentGatewayAdapter;

public interface IRazorpayGatewayAdaptee {
    public String makePayment(int amount, String pin);
    public void getPaymentInfo(String paymentId);
    public void mailPaymentDetails(String paymentId);
    public void setPaymentDetails(String bankName, String cardNumber, String name, int cvv, String expiryDate);
}
