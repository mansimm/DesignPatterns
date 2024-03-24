package adaptorPattern;

public class ProcessPaymentImpl implements ProcessPayment{
    @Override
    public void pay(int dollar) {
        System.out.println("Processed payment of dollar "+dollar);
    }
}
