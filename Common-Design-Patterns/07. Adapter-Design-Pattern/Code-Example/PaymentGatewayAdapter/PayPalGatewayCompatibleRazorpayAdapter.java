package PaymentGatewayAdapter;

public class PayPalGatewayCompatibleRazorpayAdapter implements IPayPalGatewayAdaptee{
    private final IRazorpayGatewayAdaptee razorpayGatewayAdaptee;

    PayPalGatewayCompatibleRazorpayAdapter(IRazorpayGatewayAdaptee razorpayGatewayAdaptee){
        this.razorpayGatewayAdaptee = razorpayGatewayAdaptee;
    }

    @Override
    public String makePayment(int amount, String pin){
        return razorpayGatewayAdaptee.makePayment(amount, pin);
    }
    public void getPaymentStatus(String paymentId){
        razorpayGatewayAdaptee.getPaymentInfo(paymentId);
    }
    public void getPaymentDetailsOnMail(String paymentId){
        razorpayGatewayAdaptee.mailPaymentDetails(paymentId);
    }

    public void setPaymentSource(String bankName, String cardNumber, String name, int cvv, String expiryDate){
        razorpayGatewayAdaptee.setPaymentDetails(bankName, cardNumber, name, cvv, expiryDate);
    }
}
