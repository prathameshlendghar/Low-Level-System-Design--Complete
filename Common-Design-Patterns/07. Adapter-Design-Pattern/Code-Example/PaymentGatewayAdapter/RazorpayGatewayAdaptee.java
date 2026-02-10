package PaymentGatewayAdapter;

public class RazorpayGatewayAdaptee implements IRazorpayGatewayAdaptee{
    String bankName;
    String cardNumber;
    String userName;
    String cardExpiryDate;
    int cvv;

    @Override
    public String makePayment(int amount, String pin){
        String paymentId = "";
        if(amount > 0){
            paymentId = "xyz";
            System.out.println("Your Payment is successful");
        }else{
            System.out.println("Sorry Your Payment Failed");
        }
        return paymentId;
    }

    @Override
    public void getPaymentInfo(String paymentId){
        if(!paymentId.isEmpty()){
            System.out.println("Your Payment was Successful");
        }else{
            System.out.println("Unfortunately your payment failed");
        }
    }

    @Override
    public void mailPaymentDetails(String paymentId){
        if(!paymentId.isEmpty()){
            System.out.println("Your Payment details are Successful sent on your registered MailId");
        }else{
            System.out.println("Unfortunately your payment failed, So no Details to send on Mail");
        }
    }

    @Override
    public void setPaymentDetails(String bankName, String cardNumber, String name, int cvv, String expiryDate){
        this.bankName = bankName;
        this.userName = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardExpiryDate = expiryDate;
        System.out.println("All you payment details set successfully");
    }
}
