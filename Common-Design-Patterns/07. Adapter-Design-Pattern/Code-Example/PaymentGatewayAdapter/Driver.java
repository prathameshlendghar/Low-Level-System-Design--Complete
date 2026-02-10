package PaymentGatewayAdapter;

public class Driver {
    public static void main(String[] args) {
        IRazorpayGatewayAdaptee razorpay = new RazorpayGatewayAdaptee();
        IPayPalGatewayAdaptee paypalAdapter = new PayPalGatewayCompatibleRazorpayAdapter(razorpay);
        MyApplicationPaymentClient client = new MyApplicationPaymentClient(paypalAdapter);


        client.submitPaymentDetailsToGateway("SBI", "1234567812341234", "Prathamesh", 111, "10/2030");
        client.makePayment(5000, "1234");
    }
}
