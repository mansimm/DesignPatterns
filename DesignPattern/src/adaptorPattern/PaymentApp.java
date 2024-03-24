package adaptorPattern;

public class PaymentApp {
    public void pay(int ruppees){
        int dolller = (int)ruppees/70;

        ProcessPayment payment = new ProcessPaymentImpl();
        payment.pay(dolller);
    }
}
